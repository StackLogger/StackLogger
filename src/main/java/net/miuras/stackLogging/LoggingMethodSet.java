package net.miuras.stackLogging;

/**
 * Created by tak.miura on 2015/05/22.
 */
public interface LoggingMethodSet {
    void trace(String message);
    void debug(String message);
    void info(String message);
    void warn(String message);
    void error(String message);
    void fatal(String message);
}
