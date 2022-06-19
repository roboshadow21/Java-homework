package Calculator;

public class Start {
    public static void main(String[] args) {
        UserMenu appRun = new UserMenu();
        Logging log = new Logging();
        appRun.CalcMenu();
        System.out.println();
        log.ProgramLog();
    }
}
