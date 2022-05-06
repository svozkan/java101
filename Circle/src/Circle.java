import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double radius, area, angle;
        double PI = 3.14;

        // Create Input Scanner Class
        Scanner input = new Scanner(System.in);

        // Ask For Radius
        System.out.println("Yaricap giriniz: [m]");
        radius = input.nextDouble();

        // Ask For Angle
        System.out.println("Aci giriniz: [deg]");
        angle = input.nextDouble();

        // Calculate Area of the Piece
        area = (PI * Math.pow(radius, 2) * angle) / 360;

        // Print
        System.out.println("Hesaplanan Alan : " + area);
    }
}
