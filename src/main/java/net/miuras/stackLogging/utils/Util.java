package net.miuras.stackLogging.utils;

import javax.annotation.Nonnull;
import java.util.Objects;


public class Util {
    public static <T> boolean startsWith(@Nonnull T[] longArray, @Nonnull T[] shortArray) {
        Objects.requireNonNull(longArray, "longArray == null");
        Objects.requireNonNull(shortArray, "shortArray == null");
        if (longArray.length < shortArray.length) return false;
        for (int pos = shortArray.length; --pos >= 0; ) {
            if (!Objects.equals(longArray[pos], shortArray[pos])) return false;
        }
        return true;
    }
}
