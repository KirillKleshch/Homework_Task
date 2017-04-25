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
        Notebook notebook = new Notebook(scanner, view);
        notebook.inputNote();
        model.addContact(notebook);
    }
}
