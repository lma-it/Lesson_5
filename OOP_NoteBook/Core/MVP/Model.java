package OOP_NoteBook.Core.MVP;

import OOP_NoteBook.Core.Infrastructure.Notebook;
import OOP_NoteBook.Core.Models.Contact;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class Model {
    Notebook noteBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        noteBook = new Notebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact(){
        if(currentIndex >= 0){
            return noteBook.getContact(currentIndex);
        }else{
            return null;
        }
    }

    public void load(){
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while(fname != null){
                String lname = reader.readLine();
                String note = reader.readLine();
                this.noteBook.add(new Contact(fname, lname, note));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(){
        try (FileWriter writter = new FileWriter(path, false)) {
            for (int i = 0; i < noteBook.count(); i++){
                Contact contact = noteBook.getContact(i);
                writter.append(contact.name + "\n");
                writter.append(contact.lastName + "\n");
                writter.append(contact.note + "\n");
            }
            writter.flush();
            writter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Notebook notebook(){
        return this.noteBook;
    }

    public int getCurrentIndex(){
        return this.currentIndex;
    }

    public void setCurrentIndex(int value){
        this.currentIndex = value;
    }

}
