package OOP_NoteBook.UI;
import static print_module.print_library.println;

import OOP_NoteBook.Config;
import OOP_NoteBook.Core.MVP.Presenter;
import java.util.Scanner;

public class App {
    public static void ButtonClick(){
        println("\033[H\033[J");
        new Config();
        Presenter pres = new Presenter(new ConsoleView(), Config.pathDB);
        pres.loadFromFile();

        // НЕОБХОДИМО ВЗЯТЬ НА ЗАМЕТКУ НЕПРЕРЫВНОЕ ВЫПОЛНЕНИЕ ПРОГРАММЫ.
        try (Scanner scan = new Scanner(System.in)){
            boolean start = true;
            while (start) {
                println(" 1 - prev 2 - next");
                String key = scan.next();
                println("\033[H\033[J");// управляющая последовательность ANSI. Она дает возможность очищать консоль и ставить курсор в нужную позицию
                switch (key) {
                    case "1":
                        pres.prev();
                        break;
                    case "2":
                        pres.next();
                        break;
                    case "n":
                        start = false;
                        break;
                    default:
                        println("Такой команды нет.");
                        break;
                }
                
            }
        }
    }
}
