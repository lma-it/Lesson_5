package OOP_Matematic.Client;

import OOP_Matematic.Exceptions.UnacceptableValueException;

//
// Программа вычисляет площадь круга по зданному радиусу.
// Прямоугольника по двум сторонам
// Добавить:
//      легкость добавления фигур
//      вычисление площади фигуры без знания типа фигуры
//      обработку возникающих проблем при создании фигуры.
//

public class MathMain {

    public static void main(String[] args) throws UnacceptableValueException {
        new App().start();
    }
}