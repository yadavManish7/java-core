package day18;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

    public static final Logger globalLogger =Logger.getGlobal();  //log for entire application
    public static final Logger localLogger = Logger.getLogger(LoggerDemo.class.getName());  // log for specific class

    public static void main(String[] args) {

        //globalLogger.setLevel(Level.OFF);   // shutting global logger off
        //globalLogger.setLevel(Level.INFO);   // INFO will print INFO and above INFO level
        globalLogger.setLevel(Level.WARNING);  // WARNING will print WARNING and above WARING level

        globalLogger.severe("Global Severe level ");
        globalLogger.warning("Global Warning level");
        globalLogger.info("Global Info level");

        //localLogger.severe("Local Severe level");

    }
}
