package OOP_NoteBook.UI;
import static print_module.print_library.printf;

import OOP_NoteBook.Core.MVP.View;
import java.util.Scanner;

public class ConsoleView implements View{

    Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setFirstName(String name) {
        printf("Name: %s", name);
    }

    @Override
    public void setLastName(String lastName) {
        printf("Last_Name: %s", lastName);
    }

    @Override
    public void setNote(String note) {
        printf("Note: %s", note);
    }

    @Override
    public String getFirstName() {
        printf("Name: ");
        return scanner.nextLine();
    }

    @Override
    public String getLastName() {
        printf("Last_Name: ");
        return scanner.nextLine();
    }

    @Override
    public String getNote() {
        printf("Note: ");
        return scanner.nextLine();
    }
    
}
