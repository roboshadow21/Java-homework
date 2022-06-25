package ChessQueen;


public class EightQueens {
    static int[] board = new int[8];
    static int line = 0;

    public static void main(String[] args) {
        QueensArrangement();
    }

    static boolean Validate() {

        if (line == 0) {
            return true;
        }

        if (board[line] > 7) {
            board[line] = 0;
            line--;
            return false;
        }

        for (int i = 0; i < line; i++) {
            if ((board[line] == board[i]) | ((Math.abs(board[line] - board[i])) == (line - i))) {
                return false;
            }
        }

        return true;
    }

    public static void QueensArrangement() {
        while (board[0] < 8) {
            if (Validate()) {
                if (line == 7) {
                    System.out.printf("""
                                    Positions of the queens:
                                     line = 0 column = %d,
                                     line = 1 column = %d,
                                     line = 2 column = %d
                                     line = 3 column = %d,
                                     line = 4 column = %d,
                                     line = 5 column = %d,
                                     line = 6 column = %d
                                     line = 7 column = %d""", board[0], board[1], board[2], board[3], board[4], board[5],
                            board[6], board[7]);
                    System.out.println();
                    board[line]++;
                } else {
                    line++;
                }
            } else {
                board[line]++;
            }
        }
    }
}
