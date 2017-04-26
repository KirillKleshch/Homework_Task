package ua.kpi.training.controller;

/**
 * Created by Kirill on 20.04.2017.
 */
public interface RegExp {
    String NAME_REGEXP = "^[А-Я][а-я]{2,30}$";
    String AGE_REGEXP = "^((1[012][0-9])|([1-9][0-9]))$";
    String EMAIL_REGEXP = "^[-z0-9_.]{1,30}@([A-z]+[A-z0-9]{1,15}.){1,2}([A-z]+[A-z0-9]{1,15})$";
    String CELL_PHONE_REGEXP = "([\\+]\\d{2}\\s?)?(([\\(\\s]\\d{3}[\\)\\s])|" +
            "(\\d{3}))[\\s-]?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2}$";
    String CELL_PHONE_OPTIONAL_REGEXP = "^(([\\+]\\d{2}\\s?)?(([\\(\\s]\\d{3}[\\)\\s])|" +
            "(\\d{3}))[\\s-]?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2})?";
    String LOCAL_PHONE_REGEXP = "^([\\+]\\d{2}\\s?)?(([\\(\\s]\\d{3}[\\)\\s])|(\\d{3}))?[\\s-]?\\d{3}[\\s-]?\\d{3}$";
    String COMMENT_REGEXP = "^([\\d\\s\\w\\.\\,\\!]){0,127}$";
    String GROUP_REGEXP = "^[А-я]{4,10}$";
    String SKYPE_NICK_REGEXP = "^[\\w\\d\\_]{3,20}$";
    String INDEX_REGEXP = "^[\\d]{8}$";
    String CITY_STREET_REGEXP = "^[А-Я][а-я]{3,20}$";
    String BUILDING_REGEXP = "^[\\d]{1,3}[\\w]?$";
    String FLAT_REGEXP = "^[\\d]{1,3}$";
}
