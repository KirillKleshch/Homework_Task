package ua.kpi.training.model;

import ua.kpi.training.controller.Notebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kirill on 20.04.2017.
 */

public class Model {

    private List<Notebook> noteBook = new ArrayList<>();

    public void addContact(Notebook newContact) {
        //newContact.getNickName()
        noteBook.add(newContact);
    }

    public Notebook getContact(String nickName) {
        for (Notebook note : noteBook) {
            if (note.getNickName().equals(nickName)) {
                return note;
            }
        }
        return null;
    }
    public List<Notebook> getNoteBook() {
        return noteBook;
    }
}
