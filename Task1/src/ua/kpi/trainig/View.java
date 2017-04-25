package ua.kpi.trainig;


public class View {
    // Text's constants
    public static String ENTER_HELLO = "Enter Hello";
    public static String ENTER_WORLD = "Enter world!";
    public static String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static String HELLO = "Hello";
    public static String WORLD = "world!";
    public static String OUTPUT_WORD = "Your string : ";
    public static String SPACE = " ";

    public void printMessage(String message1, String message2) {
        StringBuilder builder = new StringBuilder();
        builder.append(message1).append(message2);
        System.out.println(builder.toString());
    }

    public void printMessage(String message1) {
        StringBuilder builder = new StringBuilder();
        builder.append(message1);
        System.out.println(builder.toString());
    }
}
