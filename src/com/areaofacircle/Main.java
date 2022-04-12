package studios.areaofacircle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        Double radius = input.nextDouble();
        Double area = (3.14) * radius * radius;
        System.out.println("Area of the circle = " + area);

    }
}
