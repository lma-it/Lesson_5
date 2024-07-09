package OOP_Matematic.Client;

import java.util.Scanner;

import OOP_Matematic.Core.Views.View;

public class ConsoleView implements View{
    Scanner scan = new Scanner(System.in);

    @Override
    public String get() {
        return scan.next();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
    
}
