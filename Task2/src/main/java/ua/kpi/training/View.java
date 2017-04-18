package ua.kpi.training;

import java.util.List;

/**
 * Created by Kirill on 15.04.2017.
 */

public class View {
    // Text's constants
    public static String ENTER_MESSAGE = "Введите число в диапазоне [";
    public static String SPACE = " ";
    public static String SQUARE_BRACKET = "]";
    public static String ERROR = "Вы ввели не число.";
    public static String WRONG_INPUT = "Вы ввели число не из нужного диапазона.";
    public static String SUCCESS = "ПОЗДРАВЛЯЕМ ВЫ УГАДАЛИ!!! ";
    public static String SECRET_VALUE = "Секретное число = ";
    public static String STATISTIC = "Ваша статистика : ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printEnterMessage(int minBarrier, int maxBarrier) {
        StringBuffer buf = new StringBuffer();
        buf.append(ENTER_MESSAGE)
                .append(minBarrier)
                .append(SPACE)
                .append(maxBarrier)
                .append(SQUARE_BRACKET
                );
        System.out.println(buf.toString());
    }

    public void printErrorMessage(int minBarrier, int maxBarrier) {
        StringBuffer buf = new StringBuffer();
        buf.append(ERROR)
                .append(ENTER_MESSAGE)
                .append(minBarrier)
                .append(SPACE)
                .append(maxBarrier)
                .append(SQUARE_BRACKET
                );
        System.out.println(buf.toString());
    }

    public void printWrongInputMessage(int minBarrier, int maxBarrier) {
        StringBuffer buf = new StringBuffer();
        buf.append(WRONG_INPUT)
                .append(ENTER_MESSAGE)
                .append(minBarrier)
                .append(SPACE)
                .append(maxBarrier)
                .append(SQUARE_BRACKET
                );
        System.out.println(buf.toString());
    }

    public void printMessageAndValue(String message, int value) {
        System.out.println(message + value);
    }

    public void printList(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }
}
