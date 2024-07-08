// package OOP_Practise.Calculator;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Sum:");

    }
}
