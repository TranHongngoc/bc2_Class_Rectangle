import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.println("Enter the height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        rectangle.display();
        System.out.println("The area is: " + rectangle.getArea());
        System.out.println("The perimeter is: " + rectangle.getPerimeter());

    }
}
