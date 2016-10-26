package com.alphadon.conf;

import java.io.File;

/**
 * @author Liu Haidong
 * @date 16/7/21
 */
public class Path {
    public Path() {
    }

    public static String getCurrentPath() {
        String path = System.getProperty("serviceframe.config.path");
        if(path == null || path.equalsIgnoreCase("")) {
            Class caller = getCaller();
            if(caller == null) {
                caller = Path.class;
            }

            path = getCurrentPath(caller);
        }

        return path;
    }
    public static Class<?> getCaller() {
        StackTraceElement[] stack = (new Throwable()).getStackTrace();
        if(stack.length < 3) {
            return Path.class;
        } else {
            String className = stack[2].getClassName();

            try {
                return Class.forName(className);
            } catch (ClassNotFoundException var3) {
                var3.printStackTrace();
                return null;
            }
        }
    }
    public static String getCurrentPath(Class<?> cls) {
        String path = cls.getProtectionDomain().getCodeSource().getLocation().getPath();
        path = path.replaceFirst("file:/", "");
        path = path.replaceAll("!/", "");
        if(path.lastIndexOf(File.separator) >= 0) {
            path = path.substring(0, path.lastIndexOf(File.separator));
        }

        if(path.substring(0, 1).equalsIgnoreCase("/")) {
            String osName = System.getProperty("os.name").toLowerCase();
            if(osName.indexOf("window") >= 0) {
                path = path.substring(1);
            }
        }

        return path;
    }
}
