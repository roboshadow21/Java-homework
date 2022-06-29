package Brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    static char[] sample = {'(', ')', '[', ']', '{', '}', '<', '>'};
    static Deque<Character> deq = new ArrayDeque<>();

    public static void main(String[] args) {
        String expression = "{a+]}{(d*3)}";
//        String expression = "<{1}+(2)>";
        Deque<Character> resultParsing;
        resultParsing = ParseExpression(expression);
        System.out.println(ValidateParenthesis(resultParsing));

    }

    static Deque<Character> ParseExpression(String expression) {
        char[] arrayExpression = expression.toCharArray();
        for (int i = 0; i < arrayExpression.length; i++) {
            for (char bracket : sample) {
                if (arrayExpression[i] == bracket) {
                    deq.add(arrayExpression[i]);
                }
            }
        }
        return deq;
    }

    static boolean ValidateParenthesis(Deque<Character> deq) {
        while (deq.size() > 0) {
            char first = deq.pollFirst();
            char last = deq.pollLast();
            for (int i = 0; i < sample.length; i++) {
                if (first == sample[i] && last == sample[i + 1]) {
                    deq.pollFirst();
                    deq.pollLast();
                    System.out.println(deq);
                } else if (first == sample[i] && last != sample[i + 1]) {
                    for (int j = 0; j < deq.size(); j++) {
                        deq.addFirst(last);
                        deq.addFirst(first);
                        first = deq.pollFirst();
                        last = deq.getLast();
                        System.out.println(deq);
                        if (deq.size() >= 2) return false;
                    }

                }

            }

        }
        return true;
    }

}

