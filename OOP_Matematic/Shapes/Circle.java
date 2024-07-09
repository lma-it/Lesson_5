package OOP_Matematic.Shapes;

import OOP_Matematic.Exceptions.UnacceptableValueException;

public class Circle extends Shape{

    private double radius;

    public static Circle create(double radius, String name) 
                throws UnacceptableValueException 
    {
        if (radius < 0){
            throw new UnacceptableValueException("radius < 0");
        }

        var instance = new Circle();
        instance.name = name;
        instance.radius = radius;
        return instance;
    }

    private Circle() {
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Name: %s radius: %d", name, radius);
    }
}
