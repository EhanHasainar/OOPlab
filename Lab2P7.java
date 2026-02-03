import java.util.Scanner;

public class ParkingCharges {

    static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3)
            charge += (hours - 3) * 0.5;

        if (charge > 10)
            charge = 10;

        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter hours for car " + i + ": ");
            double h = sc.nextDouble();

            double fee = calculateCharges(h);
            System.out.println("Charge = " + fee);

            total += fee;
        }

        System.out.println("Total receipts = " + total);
    }
}
