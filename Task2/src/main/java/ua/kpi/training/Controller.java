package ua.kpi.training;

/**
 * Created by Kirill on 15.04.2017.
 */

import java.util.Scanner;

public class Controller implements GlobalVariables {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        while (!model.checkValue(getValueFromUser(sc))) ;

        view.printMessage(View.SUCCESS);
        view.printMessageAndValue(View.SECRET_VALUE , model.getSecretValue());
        view.printMessage(View.STATISTIC);
        view.printList(model.getAllUserValues());
    }

    public int getValueFromUser(Scanner sc) {
        view.printEnterMessage(model.getMinBarrier(),model.getMaxBarrier());
        int valueFromUser;
        while (!sc.hasNextInt()) {
            view.printErrorMessage(model.getMinBarrier(),model.getMaxBarrier());
            sc.next();
        }
        while ((valueFromUser = sc.nextInt()) < model.getMinBarrier() || valueFromUser > model.getMaxBarrier()) {
            view.printWrongInputMessage(model.getMinBarrier(),model.getMaxBarrier());
        }
        return valueFromUser;
    }
}

