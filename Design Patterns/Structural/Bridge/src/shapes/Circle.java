package shapes;

import colors.Color;

public class Circle extends Shape{
    private final float radius;

    public Circle(Color color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateDiameter(){
        return 2 * radius;
    }
}
