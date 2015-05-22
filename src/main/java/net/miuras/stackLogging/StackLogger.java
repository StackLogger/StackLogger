package net.miuras.stackLogging;


import lombok.Setter;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StackLogger {
    @Setter @Nonnull
    private static LoggingMethodSet loggingMethods = new LoggingMethodSet() {
        @Override
        public void trace(String message) {
            System.out.println(message);
        }

        @Override
        public void debug(String message) {
            System.out.println(message);
        }

        @Override
        public void info(String message) {
            System.out.println(message);
        }

        @Override
        public void warn(String message) {
            System.out.println(message);
        }

        @Override
        public void error(String message) {
            System.out.println(message);
        }

        @Override
        public void fatal(String message) {
            System.out.println(message);
        }
    };

    public static void setLogginMethod(@Nullable String key, LoggingMethodSet loggingMethods) {
        Objects.requireNonNull(loggingMethods);
        if (key == null) setLoggingMethods(loggingMethods);
        else loggingMethodsMap.put(key, loggingMethods);
    }

    public static void clearStack() {
        synchronized (openLoggingStacksMonitor) {
            openLoggingStacks.remove();
        }
    }

    public static void trace(String message) {
        // TODO implement
        loggingMethods.trace(message);
    }

    public static void debug(String message) {
        // TODO implement
        loggingMethods.debug(message);
    }

    public static void info(String message) {
        // TODO implement
        loggingMethods.info(message);
    }

    public static void warn(String message) {
        // TODO implement
        loggingMethods.warn(message);
    }

    public static void error(String message) {
        // TODO implement
        loggingMethods.error(message);
    }

    public static void fatal(String message) {
        // TODO implement
        loggingMethods.fatal(message);
    }

    public static void trace(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.trace(message);
    }

    public static void debug(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.debug(message);
    }

    public static void info(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.info(message);
    }

    public static void warn(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.warn(message);
    }

    public static void error(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.error(message);
    }

    public static void fatal(String key, String message) {
        // TODO implement
        LoggingMethodSet methodsForKey = loggingMethodsMap.get(key);
        if (methodsForKey == null) methodsForKey = loggingMethods;
        methodsForKey.fatal(message);
    }

    ///////////////////////////////////////////////////////////////////////////////

    private static Map<String, LoggingMethodSet> loggingMethodsMap = new HashMap<>();

    private static final ThreadLocal<List<StackTraceElement[]>> openLoggingStacks = new ThreadLocal<>();
    private static final Object openLoggingStacksMonitor = new Object();

    private static int getDepth() {
        final StackTraceElement[] curretnStackTrace = Thread.currentThread().getStackTrace();
        // TODO implement
        throw new UnsupportedOperationException();
    }
}
