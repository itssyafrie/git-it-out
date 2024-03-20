import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        System.out.println("Calculate The Area of A Circle Here!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle's radius in cm:");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + area + "cm square");
    }
}
