package ua.kpi.training.view;

import ua.kpi.training.controller.Notebook;

import java.util.List;

/**
 * Created by Kirill on 20.04.2017.
 */
public class View {
    public static String ERROR = "Ви ввели не правильные данные";
    public static String ERROR_GROUP = "Ви ввели не существующую группу";
    public static String SUCCESS = "Абонент занесен в записную книгу";
    public static String BEGIN = "Занесите в записную книгу нового абанента : ";
    public static String YES = "Да";
    public static String ASK_FOR_CONSENT = "Если хотите внести нового абонента введите \"Да\", иначе любое другое слово";
    static String ENTER_NAME = "Введите имя";
    static String ENTER_SURNAME = "Введите фамилию";
    static String ENTER_PATRONYMIC = "Введите отчество";
    static String ENTER_EMAIL = "Введите емейл";
    static String ENTER_AGE = "Введите взраст от 1 до 120";
    static String ENTER_CELL_PHONE = "Введите мобильний телефон";
    static String ENTER_LOCAL_PHONE = "Введите домашний телефон";
    static String ENTER_CELL_PHONE_SECOND = "Введите второй мобильный телефон, это поле может быть пустым";
    static String ENTER_COMMENT = "Введите коментарий";
    static String ENTER_NICKNAME = "Введите ваш ник, поле должно быть уникальным";
    static String ENTER_GROUP = "Виберите группу для контакта Друзья,Семья,Работа,Другое";
    static String ENTER_SKYPE = "Введите скайп";
    static String ENTER_INDEX = "Введите индекс";
    static String ENTER_CITY = "Введите город";
    static String ENTER_STREET = "Введите улицу";
    static String ENTER_BUILDING = "Введите номер дома";
    static String ENTER_FLAT = "Введите номер квартиры";
    public String CONTACT_NUMBER = "Контакт номер : ";
    public String LINE = "---------------------------------";
    public static String SPACE = " ";
    public static String DOT = ".";
    public static String COMMA = ",";

    public void printError() {
        print(ERROR);
    }

    public void print(String... message) {
        StringBuilder builder = new StringBuilder(message.length);
        for (String value : message) {
            builder.append(value).append(SPACE);
        }
        System.out.println(builder.toString());
    }

    public void printList(List<Notebook> list) {
        list.stream().forEach((note) -> {
                    print(CONTACT_NUMBER, String.valueOf(list.indexOf(note) + 1));
                    print(note.getInformation());
                    print(LINE);
                }
        );
    }

    public void printDescription(DefaultEnterMessages description) {
        for (DefaultEnterMessages message : DefaultEnterMessages.values()) {
            if (message.equals(description)) {
                print(description.getDescription());
                break;
            }
        }
    }
}
