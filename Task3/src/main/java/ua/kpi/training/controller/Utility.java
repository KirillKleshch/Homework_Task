package ua.kpi.training.controller;

import ua.kpi.training.view.DefaultEnterMessages;
import ua.kpi.training.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Kirill on 20.04.2017.
 */
public class Utility {
    private Scanner scanner;
    private View view;

    public Utility(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public int getInt(String regExp, DefaultEnterMessages description){
        int number = 0;
        String input;
        view.printDescription(description);
        while(scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (Pattern.matches(regExp, input)){
                number = Integer.parseInt(input);
                break;
            } else {
                view.printError();
            }
        }
        return number;
    }

    public String getString(String regExp, DefaultEnterMessages description) {
        String input = "";
        view.printDescription(description);
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (Pattern.matches(regExp, input)){
                break;
            } else {
                view.printError();
            }
        }
        return input;
    }

    public GroupContact getGroup(String regExp) {
        String input;
        view.printDescription(DefaultEnterMessages.GROUP);
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            if (Pattern.matches(regExp, input)){
                for (GroupContact groupName : GroupContact.values()) {
                    if (groupName.getGroupName().equalsIgnoreCase(input)) {
                        return groupName;
                    }
                }
                view.print(View.ERROR_GROUP);
            }
            else {
                view.printError();
            }
        }
        return GroupContact.OTHER;
    }
}
