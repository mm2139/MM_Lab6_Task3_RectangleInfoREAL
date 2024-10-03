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
                        if (side2 < 0 || side2 == side1) {
                            System.out.println("You have inputted an invalid response, please try again.");
                            scan.nextLine();
                        } else {
                            allValues = true;
                        }
                    } else {
                        System.out.println("You have inputted an invalid response, please try again.");
                        scan.nextLine();
                    }
        } while (side2 == 0);

        System.out.printf("Side 1: %.2f", "\n Side 2: %.2f" "\n Area: %.2f" "\n Perimeter: %2f" "Diagonal: %.2f");

    }
}