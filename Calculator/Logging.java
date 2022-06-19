package Calculator;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logging {
    public void ProgramLog() {
        Logger logger = Logger.getLogger(Logging.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.addHandler(ch);
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "Program Calculator logging");
    }
}
