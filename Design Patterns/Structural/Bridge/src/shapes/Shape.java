package shapes;

import colors.Color;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public boolean isDangerous(){
        return color.redLevel() <= 0.5f;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
