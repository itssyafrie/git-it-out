import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        System.out.println("Calculate The Area of A Triangle Here!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the triangle's height in cm:");
        double height = scanner.nextDouble();
        System.out.println("Enter the triangle's width in cm:");
        double width = scanner.nextDouble();
        double area = .5 * (height * width);
        System.out.println("The area of the triangle is: " + area + "cm square");
    }
}
