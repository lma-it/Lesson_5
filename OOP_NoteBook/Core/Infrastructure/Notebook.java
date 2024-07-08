package OOP_NoteBook.Core.Infrastructure;
import java.util.List;

import OOP_NoteBook.Core.Models.Contact;

import java.util.ArrayList;

public class Notebook {
    private List<Contact> contacts;

    public Notebook() {
        contacts = new ArrayList<Contact>();

    }

    public boolean add(Contact contact){
        boolean flag = false;
        if(!contacts.contains(contact)){
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getContact(int index){
        return contains(index) ? contacts.get(index) : null;
    }

    public boolean remove(Contact contact){
        boolean flag = false;
        if(contacts.indexOf(contact) != -1){
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    private boolean contains(int index){
        return contacts != null && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public int count(){
        return contacts.size();
    }
}
