package OOP_Matematic.Client;

import OOP_Matematic.CalculateArea.CalculateArea;
import OOP_Matematic.Core.Models.Model;
import OOP_Matematic.Core.Presenters.Presenter;
import OOP_Matematic.Core.Views.View;
import OOP_Matematic.Exceptions.UnacceptableValueException;


public class App {
    Presenter p;
    View view;
    Model model;

    public App() {
        view = new ConsoleView();
        model = new Model(CalculateArea.getInstance(), "Без имени.jpg");
        p = new Presenter(view, model);
    }

    public void start()
        throws UnacceptableValueException
    {
        StringBuilder sb = new StringBuilder()
                        .append("\n ==== \n")
                        .append("1 - append shape\n")
                        .append("2 - show shape\n")
                        .append("3 - show all area\n")
                        .append("0 - exit\n");
        


        while(true){
            view.set(sb.toString());
            switch (view.get()) {
                case "1":
                    p.append();
                    break;
                case "2":
                    p.show();
                    break;
                case "3":
                    p.showArea();
                    break;
                case "0":
                    return;
            }
        }
    }
}
