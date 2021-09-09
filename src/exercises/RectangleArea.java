package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of the rectangle: ");
        Double length = input.nextDouble();

        System.out.println("Width of the rectangle: ");
        Double width = input.nextDouble();

        System.out.println("The area of the rectangle is " + (length*width));
    }
}
