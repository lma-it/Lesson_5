package OOP_Matematic.Shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected double area;
    protected String name;


    public double getArea(){
        return area;
    }


    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Shape> shapes = new ArrayList<Shape>();

    public void Print(StringBuilder sb, String indent){
        sb.append(String.format("%s %s %s\n",indent, name, getArea()));

        for (Shape shape : shapes) {
            shape.Print(sb, indent + " ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Print(sb, "");
        return sb.toString();
    }
}
