package Decorator;

import Factory.Figure;
import Factory.Point;

public class FigurePerimeter {
    public static double getPerimeter(Figure figure) {
        if (figure.getPoints().length < 3) {
            System.out.println("It's not a polygon!");
            return 0;
        }
        double result = 0;
        for (int i = 0; i < figure.getPoints().length; i++) {
            if (i + 1 < figure.getPoints().length) {
                double left = Math.pow((figure.getPoints()[i + 1].getX() - figure.getPoints()[i].getX()), 2);
                double right = Math.pow((figure.getPoints()[i + 1].getY() - figure.getPoints()[i].getY()), 2);
                result += Math.sqrt(left + right);
            }else {
                double left = Math.pow((figure.getPoints()[0].getX() - figure.getPoints()[i].getX()), 2);
                double right = Math.pow((figure.getPoints()[0].getY() - figure.getPoints()[i].getY()), 2);
                result += Math.sqrt(left + right);
            }
        }
        return result;
    }
}
