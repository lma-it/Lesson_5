package OOP_Matematic.Core.Models;

import OOP_Matematic.CalculateArea.Calculate;
import OOP_Matematic.Shapes.Canvas;
import OOP_Matematic.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;
    

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);
        calc = c;
    }


    public void append(Shape shape){
        panel.shapes.add(shape);
    }

    public double area(){
        return calc.visit(panel);
    }

    public String show(){
        return panel.toString();
    }
}
