package OOP_Practise.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        new Presenter(new SumModel(), new View()).buttonClick();;
    }
}
