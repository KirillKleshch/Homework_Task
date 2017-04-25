package ua.kpi.training.controller;

import ua.kpi.training.model.Model;
import ua.kpi.training.view.View;

import java.util.Scanner;

/**
 * Created by Kirill on 20.04.2017.
 */
public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        Notebook notebook;
        view.print(View.ASK_FOR_CONSENT);
        while (scanner.nextLine().equalsIgnoreCase(View.YES)) {
            notebook = new Notebook(scanner, view);
            view.print(View.BEGIN);
            notebook.fillData();
            model.addContact(notebook);
            view.print(View.SUCCESS);
            view.print(View.ASK_FOR_CONSENT);
        }
        view.printList(model.getNoteBook());
    }
}
