package empresa.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {
    private final static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    private static int count = 0;
    private final static String INVALID = "Invalid data format";
    private final static String TOO_MANY_TRIES = "Too many tries";

    public double askDouble() {
        try {
            System.out.println("Introduce a valid number with decimals:");
            return Double.parseDouble(buffer.readLine());
        } catch (Exception e) {
            if (breakLoop())
                return askDouble();
            else return 0.0;
        }
    }

    public double askDouble(String message) {
        try {
            System.out.println(message);
            return Double.parseDouble(buffer.readLine());
        } catch (Exception e) {
            if (breakLoop())
                return askDouble(message);
            else return 0.0;
        }
    }

    public static String askString() {
        try {
            System.out.println("Introduce a text:");
            return buffer.readLine();
        } catch (Exception e) {
            if (breakLoop())
                return askString();
            else return "";
        }
    }

    public static String askString(String message) {
        try {
            System.out.println(message);
            return buffer.readLine();
        } catch (Exception e) {
            if (breakLoop())
                return askString(message);
            else return "";
        }
    }

    public static int askInt() {
        try {
            System.out.println("Introduce a number:");
            return Integer.parseInt(buffer.readLine());
        } catch (Exception e) {
            if (breakLoop())
                return askInt();
            else return 0;
        }
    }

    public static int askInt(String message) {
        try {
            System.out.println(message);
            return Integer.parseInt(buffer.readLine());
        } catch (Exception e) {
            if (breakLoop())
                return askInt(message);
            else return 0;
        }
    }

    private static boolean breakLoop() {
        if (count < 3) {
            count++;
            System.out.println(INVALID);
            return true;
        } else {
            System.out.println(TOO_MANY_TRIES);
            count = 0;
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T ask(String message, Types type) {
        System.out.println(message);
        try {
            switch (type) {
                case BOOLEAN -> {
                    return (T) Boolean.valueOf(buffer.readLine());
                }
                case INT -> {
                    return (T) Integer.valueOf(buffer.readLine());
                }
                case STRING -> {
                    return (T) buffer.readLine();
                }
                case DOUBLE -> {
                    return (T) Double.valueOf(buffer.readLine());
                }
                case LONG -> {
                    return (T) Long.valueOf(buffer.readLine());
                }
                case FLOAT -> {
                    return (T) Float.valueOf(buffer.readLine());
                }
                case CHAR -> {
                    return (T) Character.valueOf(buffer.readLine().charAt(0));
                }
                default -> throw new Exception();
            }
        } catch (Exception e) {
            if (breakLoop())
                return ask(message, type);
            else return defaultValue(type);
        }
    }

    @SuppressWarnings("unchecked")
    private static  <T> T defaultValue(Types type) {
        switch (type) {
            case BOOLEAN -> {
                return (T) Boolean.valueOf(false);
            }
            case INT -> {
                return (T) Integer.valueOf(0);
            }
            case STRING -> {
                return (T) "";
            }
            case DOUBLE -> {
                return (T) Double.valueOf(0);
            }
            case LONG -> {
                return (T) Long.valueOf(0);
            }
            case FLOAT -> {
                return (T) Float.valueOf(0);
            }
            case CHAR -> {
                return (T) Character.valueOf('A');
            }
        }
        return null;
    }

    public enum Types {
        BOOLEAN, INT, STRING, DOUBLE, LONG, FLOAT, CHAR
    }
}
