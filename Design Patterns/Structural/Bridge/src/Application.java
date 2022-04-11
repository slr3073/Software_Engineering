import colors.Cyan;
import colors.Green;
import shapes.Circle;

public class Application {
    public static void main(String[] args) {
        Circle c = new Circle(new Cyan(), 3);
        System.out.println(c.calculateArea());
        System.out.println(c.isDangerous() + "\n");


        Circle c2 = new Circle(new Green(), 1);
        System.out.println(c2.calculateArea());
        System.out.println(c2.isDangerous());
    }
}
