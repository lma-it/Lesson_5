// package OOP_Practise.Calculator;
import static print_module.print_library.printf;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public int getValue(String title){
        printf("%s", title);
        return scanner.nextInt();
    }

    public void print(int data, String title){
        printf("%s %d", title, data);
    }
}
