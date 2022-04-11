package shapes;

import colors.Color;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
