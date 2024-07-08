package OOP_NoteBook.Core.MVP;
import OOP_NoteBook.Core.Models.Contact;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void loadFromFile(){
        model.load();

        if(model.notebook().count() > 0){
            model.setCurrentIndex(0);
            var contact = model.currentContact();

            view.setFirstName(contact.name);
            view.setLastName(contact.lastName);
            view.setNote(contact.note);
        }
    }

    public void add(){
        model.notebook().add(new Contact(view.getFirstName(), view.getLastName(), view.getNote()));
    }

    public void remove(){
        Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getNote());
        model.notebook().remove(contact);

        if(model.notebook().count() < 1){
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setNote("");
        }else{
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if(model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);
            
            Contact temp = model.currentContact();
            view.setFirstName(temp.name);
            view.setLastName(temp.lastName);
            view.setNote(temp.note);
        }
    }

    public void saveToFile(){
        model.save();
    }

    public void next(){
        if(model.notebook().count() > 0){
            if(model.getCurrentIndex() + 1 < model.notebook().count()){
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.name);
                view.setLastName(contact.lastName);
                view.setNote(contact.note);
            }
        }
    }

    public void prev(){
        
        if(model.notebook().count() > 0){
            if(model.getCurrentIndex() - 1 > - 1){
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.name);
                view.setLastName(contact.lastName);
                view.setNote(contact.note);
            }
        }
    }
}