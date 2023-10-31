package final_work;

import org.jetbrains.annotations.NotNull;

abstract class MyStacktrace extends Exception{

    public static void printStacktrace(@NotNull Exception exception) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        System.out.print(ANSI_RED);
        System.out.println(exception.toString());
        for (StackTraceElement element : exception.getStackTrace()) {
            System.out.println(element);
        }
        System.out.println(ANSI_RESET);
    }


}
