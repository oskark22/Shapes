package ie.atu.myOwn;

import java.util.Scanner;

public class Shapeapp {

    public static void main(String[] args) {
        System.out.println("Please enter the length of the rectangle: ");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered: " + length);

        System.out.println("Please enter the width of the rectangle: ");
        double width = input.nextDouble();
        System.out.println("You entered: " + width);
    }
}
