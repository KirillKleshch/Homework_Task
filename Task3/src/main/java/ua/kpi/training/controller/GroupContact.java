package ua.kpi.training.controller;

/**
 * Created by Kirill on 20.04.2017.
 */
public enum GroupContact {
    FRIENDS("Друзья"),
    FAMILY("Семья"),
    WORK("Работа"),
    OTHER("Другое");

    private String groupName;

    GroupContact(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
