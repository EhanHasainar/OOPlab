class Invoice {
    String partNumber, partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String pNo, String desc, int qty, double price) {
        partNumber = pNo;
        partDescription = desc;
        quantity = (qty > 0) ? qty : 0;
        pricePerItem = (price > 0) ? price : 0.0;
    }

    int getQuantity() { return quantity; }
    void setQuantity(int q) { quantity = (q > 0) ? q : 0; }

    double getPrice() { return pricePerItem; }
    void setPrice(double p) { pricePerItem = (p > 0) ? p : 0.0; }

    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i = new Invoice("A1", "Mouse", 4, 250);
        System.out.println("Total Amount = " + i.getInvoiceAmount());
    }
}
