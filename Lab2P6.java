import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account no: ");
        int acc = sc.nextInt();

        System.out.print("Beginning balance: ");
        int bal = sc.nextInt();

        System.out.print("Charges: ");
        int charges = sc.nextInt();

        System.out.print("Credits: ");
        int credits = sc.nextInt();

        System.out.print("Credit limit: ");
        int limit = sc.nextInt();

        int newBalance = bal + charges - credits;

        System.out.println("New Balance = " + newBalance);

        if (newBalance > limit)
            System.out.println("Credit limit exceeded");
        else
            System.out.println("Within limit");
    }
}
