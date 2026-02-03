class Date {
    int month, day, year;

    Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date(2, 5, 2026);
        d.displayDate();
    }
}
