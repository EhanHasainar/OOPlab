import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Miles per day: ");
        double miles = sc.nextDouble();

        System.out.print("Cost per gallon: ");
        double cost = sc.nextDouble();

        System.out.print("Parking fees per day: ");
        double fees = sc.nextDouble();

        System.out.print("Tolls per day: ");
        double tolls = sc.nextDouble();

        double totalCost = (miles * cost) + fees + tolls;

        System.out.println("Daily driving cost = " + totalCost);
    }
}
