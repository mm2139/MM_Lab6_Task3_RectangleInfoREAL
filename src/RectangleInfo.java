import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        boolean allValues = false;
        double side1 = 0;
        double side2 = 0;

        do {
            System.out.println("Please input one side length of a rectangle:");
            if (scan.hasNextDouble()) {
                side1 = scan.nextDouble();
                if (side1 < 0) {
                    System.out.println("You have inputted an invalid response, please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have inputted an invalid response, please try again.");
                scan.nextLine();
            }
        } while (side1 == 0);

        do {
                    System.out.println("Please input another side length of a rectangle:");
                    if (scan.hasNextDouble()) {
                        side2 = scan.nextDouble();
                        if (side2 > 0 && side2 != side1) {
                            allValues = true;
                        } else {
                            System.out.println("You have inputted an invalid response, please try again.");
                            scan.nextLine();
                        }
                    } else {
                        System.out.println("You have inputted an invalid response, please try again.");
                        scan.nextLine();
                    }
        } while (side2 == 0 || side2 == side1);

        System.out.printf("Side 1: %.2f \nSide 2: %.2f \nArea: %.2f \nPerimeter: %.2f \nDiagonal: %.2f", side1, side2, side1*side2, 2*(side1+side2), Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2)));
    }
}