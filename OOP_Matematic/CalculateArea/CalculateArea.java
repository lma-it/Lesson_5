package OOP_Matematic.CalculateArea;

import OOP_Matematic.Shapes.Shape;

public class CalculateArea implements Calculate{

    private static CalculateArea instance;


    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }


    private class RefInt {
        public double value;

        public RefInt(double value) {
            this.value = value;
        }
    }

    public void calculate(Shape shape, RefInt ref){
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }
    }

    public double visit(Shape shape) {
        
        RefInt area = new RefInt(0);

        calculate(shape, area);

        return area.value;
    }
    
}
