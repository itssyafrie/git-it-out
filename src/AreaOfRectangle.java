import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle length in cm:");
        double length = scanner.nextDouble();
        System.out.println("Enter rectangle width in cm:");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The rectangle area is: " + area + "cm");
    }
}
