package ua.kpi.training.view;


/**
 * Created by Kirill on 20.04.2017.
 */
public enum DefaultEnterMessages {
    NAME(View.ENTER_NAME),
    SURNAME(View.ENTER_SURNAME),
    PATRONYMIC(View.ENTER_PATRONYMIC),
    EMAIL(View.ENTER_EMAIL),
    AGE(View.ENTER_AGE),
    CELL_PHONE(View.ENTER_CELL_PHONE),
    LOCAL_PHONE(View.ENTER_LOCAL_PHONE),
    CELL_PHONE_SECOND(View.ENTER_CELL_PHONE_SECOND),
    COMMENT(View.ENTER_COMMENT),
    NICKNAME(View.ENTER_NICKNAME),
    GROUP(View.ENTER_GROUP),
    SKYPE(View.ENTER_SKYPE),
    CITY(View.ENTER_CITY),
    INDEX(View.ENTER_INDEX),
    STREET(View.ENTER_STREET),
    BUILDING(View.ENTER_BUILDING),
    FLAT(View.ENTER_FLAT);


    private String description;

    DefaultEnterMessages(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
