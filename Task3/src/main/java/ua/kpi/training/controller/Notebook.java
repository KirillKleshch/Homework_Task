package ua.kpi.training.controller;

import ua.kpi.training.view.DefaultEnterMessages;
import ua.kpi.training.view.View;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Kirill on 20.04.2017.
 */
public class Notebook {
    private View view;
    private Scanner scanner;

    private String surname;
    private String name;
    private String patronymic;
    private String fullName;
    private String age;
    private String nickName;//уникальное поле
    private String comment;
    private GroupContact group;
    private String localPhone;
    private String cellPhone1;
    private String cellPhone2;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String building;
    private int flat;
    private String address;
    private final Date timeCreation = Calendar.getInstance().getTime();
    private Date timeLastModification;

    public Notebook(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void fillData() {
        Utility utility = new Utility(scanner, view);

        this.name = utility.getString(RegExp.NAME_REGEXP, DefaultEnterMessages.NAME);
        this.surname = utility.getString(RegExp.NAME_REGEXP, DefaultEnterMessages.SURNAME);
        this.patronymic = utility.getString(RegExp.NAME_REGEXP, DefaultEnterMessages.PATRONYMIC);
        this.fullName = createName(this.name, this.surname);
        this.age = utility.getString(RegExp.AGE_REGEXP, DefaultEnterMessages.AGE);
        this.email = utility.getString(RegExp.EMAIL_REGEXP, DefaultEnterMessages.EMAIL);
        this.localPhone = utility.getString(RegExp.LOCAL_PHONE_REGEXP, DefaultEnterMessages.LOCAL_PHONE);
        this.cellPhone1 = utility.getString(RegExp.CELL_PHONE_REGEXP, DefaultEnterMessages.CELL_PHONE);
        this.cellPhone2 = utility.getString(RegExp.CELL_PHONE_OPTIONAL_REGEXP, DefaultEnterMessages.CELL_PHONE_SECOND);
        this.comment = utility.getString(RegExp.COMMENT_REGEXP, DefaultEnterMessages.COMMENT);
        this.skype = utility.getString(RegExp.SKYPE_NICK_REGEXP, DefaultEnterMessages.SKYPE);
        this.nickName = utility.getString(RegExp.SKYPE_NICK_REGEXP, DefaultEnterMessages.NICKNAME);
        this.group = utility.getGroup(RegExp.GROUP_REGEXP);
        this.index = utility.getString(RegExp.INDEX_REGEXP, DefaultEnterMessages.INDEX);
        this.city = utility.getString(RegExp.CITY_STREET_REGEXP, DefaultEnterMessages.CITY);
        this.street = utility.getString(RegExp.CITY_STREET_REGEXP, DefaultEnterMessages.STREET);
        this.building = utility.getString(RegExp.BUILDING_REGEXP, DefaultEnterMessages.BUILDING);
        this.flat = utility.getInt(RegExp.FLAT_REGEXP, DefaultEnterMessages.FLAT);
        this.address = createAddress(index, city, street, building, flat);
        this.timeLastModification = timeCreation;
    }

    public void setFirstName(String firstName) {
        this.name = name;
        modifyTime();
    }

    public void modifyTime() {
        this.timeLastModification = Calendar.getInstance().getTime();
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getInformation() {
        return concatenate(surname, name, patronymic, fullName, age, nickName, comment,
                skype, group.getGroupName(), cellPhone1, localPhone, email, skype,
                address, timeCreation.toString(), timeLastModification.toString());
    }

    private String createName(String name, String surname) {
        String result = new StringBuilder().append(surname)
                .append(View.SPACE)
                .append(name.charAt(0))
                .append(View.DOT)
                .toString();
        return result;
    }

    private String createAddress(String index, String city, String street, String building, int flat) {
        StringBuilder result = new StringBuilder(5);
        result.append(index).append(View.SPACE)
                .append(city).append(View.SPACE)
                .append(street).append(View.SPACE).append(building)
                .append(View.COMMA).append(View.SPACE)
                .append(flat).append(View.DOT);
        return result.toString();
    }

    private String concatenate(String... fields) {
        StringBuilder result = new StringBuilder(fields.length);
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
            if (i != fields.length - 1) {
                result.append('\n');
            }
        }
        return result.toString();
    }
}

