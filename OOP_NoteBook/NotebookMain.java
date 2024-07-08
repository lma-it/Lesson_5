package OOP_NoteBook;

import OOP_NoteBook.Core.MVP.Presenter;
import OOP_NoteBook.UI.ConsoleView;


// Создать записную книжку
// создать контакт
// увидеть контакт
// удалить контакт
// редактировать контакт
// Реализовать навигацию по меню
//
//
//

public class NotebookMain {
    public static void main(String[] args) {
        new Config();
        Presenter present = new Presenter(new ConsoleView(), Config.pathDB);
        // present.add();
        // present.add();
        // present.add();
        present.loadFromFile();

        present.next();
        present.next();
        present.next();

        present.saveToFile();


    }
}
