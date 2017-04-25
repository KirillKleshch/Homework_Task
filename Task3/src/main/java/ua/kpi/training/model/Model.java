package ua.kpi.training.model;

import ua.kpi.training.controller.Notebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kirill on 20.04.2017.
 */

public class Model {

    private List<Notebook> addressBook = new ArrayList<>();

    public void addContact(Notebook newContact) {
        addressBook.add(newContact);
    }

    public Notebook getContact(String name, String surname) {
        for (Notebook addressPage : addressBook) {
            if (addressPage.getName().equals(name) && addressPage.getSurname().equals(surname)) {
                return addressPage;
            }
        }
        return null;
    }
    public List<Notebook> getAddressBook() {
        return addressBook;
    }
}
