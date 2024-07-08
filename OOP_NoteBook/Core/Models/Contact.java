package OOP_NoteBook.Core.Models;
import java.time.LocalDate;

public class Contact implements Comparable<Contact>{
    public LocalDate date;
    public String name;
    public String lastName;
    public String company;
    public String phone;
    public String note;

    public Contact(String name, String lastName, String note) {
        this.name = name;
        this.lastName = lastName;
        this.note = note;
    }
    




    @Override
    public boolean equals(Object obj) {
        Contact contact = (Contact)obj;
        return this.name == contact.name && this.lastName == contact.lastName;
    }



    @Override
    public int compareTo(Contact o) {
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
}
