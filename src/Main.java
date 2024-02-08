import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Json.InvoiceItem> invoiceItems = List.of(
                new Json.InvoiceItem("Coca Cola 2L", 10),
                new Json.InvoiceItem("Rum Santa Teresa 0.7L", 15),
                new Json.InvoiceItem("Ice bag L", 5.5)
        );

        Json.Invoice invoice = new Json.Invoice("YMZ-0000001", 30.5, false, invoiceItems);
        System.out.println(invoice.getId());
        System.out.println(invoice.getTotal());
        System.out.println(invoice.isPaid());
    }
}
