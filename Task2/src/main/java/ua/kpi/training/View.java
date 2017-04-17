package ua.kpi.training;
import java.util.List;

/**
 * Created by Kirill on 15.04.2017.
 */

public class View {
    // Text's constants
    public static  String ENTER_MESSAGE = "Введите число в диапазоне [";
    public static  String SPACE = " ";
    public static  String SQUARE_BRACKET = "]";
    public static  String ERROR = "Вы ввели не число.";
    public static  String WRONG_INPUT = "Вы ввели число не из нужного диапазона.";
    public static  String SUCCESS = "ПОЗДРОВЛЯЕМ ВЫ УГАДАЛИ!!! ";
    public static  String SECRET_VALUE = "Секретное число = ";
    public static  String STATISTIC = "Ваша статистика : ";

    public void printMessage(String message){
        System.out.println(message);
    }
    public void printList(List<Integer> list){
        list.stream().forEach(System.out::println);
    }
}
