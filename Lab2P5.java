import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miles, gallons;
        double totalMiles = 0, totalGallons = 0;

        while (true) {
            System.out.print("Enter miles (-1 to stop): ");
            miles = sc.nextInt();
            if (miles == -1) break;

            System.out.print("Enter gallons: ");
            gallons = sc.nextInt();

            double mpg = (double) miles / gallons;
            System.out.println("MPG = " + mpg);

            totalMiles += miles;
            totalGallons += gallons;
        }

        System.out.println("Combined MPG = " + (totalMiles / totalGallons));
    }
}
