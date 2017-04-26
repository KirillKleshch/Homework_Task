package ua.kpi.training.model;

import ua.kpi.training.controller.Notebook;
import ua.kpi.training.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kirill on 20.04.2017.
 */

public class Model {

    private List<Notebook> noteBook = new ArrayList<>();

    public void addContact(Notebook newContact) throws ReMeetingNickNameException {
        for(NickName nick : NickName.values()){
            if(newContact.getNickName().equalsIgnoreCase(nick.getDescription())){
                throw new ReMeetingNickNameException(View.ERROR_NICK);
            }
        }
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
