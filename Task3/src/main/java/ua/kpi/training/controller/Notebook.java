package ua.kpi.training.controller;

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
    private String nickName;
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

   

    public void modifyTime() {
        this.timeLastModification = Calendar.getInstance().getTime();
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }

    /*public String getFullData() {
        return concatenate(name,surname, fullName, nickName, skype,
                cellPhone1, localPhone, address, group.getGroupName(),
                email, timeLastModification.toString(),
                timeCreation.toString());
    }*/

    private String makeName(String name, String surname) {
        String result = new StringBuilder().append(surname)
                .append(View.SPACE)
                .append(name.charAt(0))
                .append(View.DOT)
                .toString();
        return result;
    }
    private String concatenate(String... args) {
        StringBuilder result = new StringBuilder(args.length);
        for (String part : args) {
            result.append(part).append('\n');
        }
        return result.toString();
    }
}

