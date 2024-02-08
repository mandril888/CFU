import java.util.List;

public class Json {
    // JSON to Java Class
    //    {
    //        "id": "YMZ-0000001",
    //        "total": 30.5,
    //        "isPaid": false,
    //        "invoiceItems": [
    //            { "name": "Coca Cola 2L", "price": "10" },
    //            { "name": "Rum Santa Teresa 0.7L", "price": "15" },
    //            { "name": "Ice bag L", "price": "5.5" }
    //        ]
    //    }

    public static class InvoiceItem {
        private String name;
        private double price;

        public InvoiceItem(String name, double price) {
            setName(name);
            setPrice(price);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static class Invoice {
        private String id;
        private double total;
        private boolean isPaid;
        private List<InvoiceItem> items;

        public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> items) {
            setId(id);
            setTotal(total);
            setPaid(isPaid);
            setItems(items);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }

        public boolean isPaid() {
            return isPaid;
        }

        public void setPaid(boolean paid) {
            isPaid = paid;
        }

        public List<InvoiceItem> getItems() {
            return items;
        }

        public void setItems(List<InvoiceItem> items) {
            this.items = items;
        }
    }
}
