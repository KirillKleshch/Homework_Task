package ua.kpi.trainig;

import java.util.Scanner;

public class Controller {

    // Constructor
    Model model;
    View view;

    String stringOfUser = new String();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        addString(inputHelloWithScanner(sc));
        addSpace();
        addString(inputWorldWithScanner(sc));
        model.setString(stringOfUser);
        view.printMessage(View.OUTPUT_WORD, model.getStr());
    }

    public String inputHelloWithScanner(Scanner sc) {
        view.printMessage(View.ENTER_HELLO);
        String bufMessage;
        while (!(bufMessage = sc.nextLine()).equals(View.HELLO)) {
            view.printMessage(view.WRONG_INPUT, view.ENTER_HELLO);
        }
        return bufMessage;
    }

    public String inputWorldWithScanner(Scanner sc) {
        view.printMessage(View.ENTER_WORLD);
        String bufMessage;
        while (!(bufMessage = sc.nextLine()).equals(View.WORLD)) {
            view.printMessage(view.WRONG_INPUT, view.ENTER_WORLD);
        }
        return bufMessage;
    }

    public void addString(String message) {
        StringBuilder builder = new StringBuilder(stringOfUser);
        stringOfUser = builder.append(message).toString();
    }

    public void addSpace() {
        StringBuilder builder = new StringBuilder(stringOfUser);
        stringOfUser = builder.append(View.SPACE).toString();
    }

}
