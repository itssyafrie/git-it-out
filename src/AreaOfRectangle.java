import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        System.out.println("Calculate The Area of A Rectangle Here!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle length in cm:");
        double length = scanner.nextDouble();
        System.out.println("Enter rectangle width in cm:");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The rectangle area is: " + area + "cm");
    }
}
