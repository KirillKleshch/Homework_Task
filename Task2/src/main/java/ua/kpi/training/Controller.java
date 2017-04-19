package ua.kpi.training;

/**
 * Created by Kirill on 15.04.2017.
 */

import java.util.Scanner;

public class Controller implements GlobalVariables {

    // Constructor
    Model model;
    View view;
    static int counter = 0;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setSecretValue(TestSequenceOfNumbers.TENRH_NUMBER.getValue());
        while (!model.checkValue(getValueFromUser()));

        view.printMessage(View.SUCCESS);
        view.printMessageAndValue(View.SECRET_VALUE, model.getSecretValue());
        view.printMessage(View.STATISTIC);
        view.printList(model.getAllUserValues());
    }

    public int getValueFromUser(Scanner sc) {
        view.printEnterMessage(model.getMinBarrier(), model.getMaxBarrier());
        int valueFromUser;
        while(true) {
            while (!sc.hasNextInt()) {
                view.printErrorMessage(model.getMinBarrier(), model.getMaxBarrier());
                sc.next();
            }
            if ((valueFromUser = sc.nextInt()) < model.getMinBarrier() || valueFromUser > model.getMaxBarrier()) {
                model.addToList(model.getAllUserValues(),valueFromUser);
                view.printWrongInputMessage(model.getMinBarrier(), model.getMaxBarrier());
            } else {
                model.addToList(model.getAllUserValues(),valueFromUser);
                break;
            }
        }
        return valueFromUser;
    }

    public int getValueFromUser() {
        view.printEnterMessage(model.getMinBarrier(), model.getMaxBarrier());
        while ( counter < TestSequenceOfNumbers.values().length) {
            System.out.println(TestSequenceOfNumbers.values()[counter].getValue());
            model.addToList(model.getAllUserValues(),TestSequenceOfNumbers.values()[counter].getValue());
            if (TestSequenceOfNumbers.values()[counter].getValue() < model.getMinBarrier()
                    || TestSequenceOfNumbers.values()[counter].getValue() > model.getMaxBarrier()) {
                view.printWrongInputMessage(model.getMinBarrier(), model.getMaxBarrier());
                counter++;
            }
            else{
                counter++;
                break;
            }
        }
        return TestSequenceOfNumbers.values()[counter-1].getValue();
    }

}

