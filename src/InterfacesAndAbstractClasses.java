import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 1) Por qué usa @Override en la clase PaymentList? --> Mejor poner el @Override
// 2) Por qué usa List en lugar de ArrayList en TransactionList y PaymentList? -->
//      No limitas las "transactions" al objeto ArrayList y puedes usar más métodos de List

public class InterfacesAndAbstractClasses {
    public interface TransactionList {
        Transaction getLastTransaction();
        void addTransaction(Transaction transaction);
        Transaction getTransactionByDate(Date date);
        List<Transaction> getAllTransactions();
    }

    public static class PaymentList implements TransactionList {
        List<Transaction> transactions = new ArrayList<Transaction>();

        @Override
        public Transaction getLastTransaction() {
            return transactions.get(transactions.size() - 1);
        }

        @Override
        public void addTransaction(Transaction transaction) {
            transactions.add(transaction);
        }

        @Override
        public Transaction getTransactionByDate(Date date) {
            for(Transaction transaction : transactions) {
                if (transaction.getDate().equals(date)) {
                    return transaction;
                }
            }

            return null;
        }

        @Override
        public List<Transaction> getAllTransactions() {
            return transactions;
        }
    }

    public static class Transaction {
        private String sellerAccountNumber;
        private String buyerAccountNumber;
        private double amount;
        private Date date;

        public Transaction(String sellerAccountNumber, String buyerAccountNumber, double amount, Date date) {
            setSellerAccountNumber(sellerAccountNumber);
            setBuyerAccountNumber(buyerAccountNumber);
            setAmount(amount);
            setDate(date);
        }

        public String getSellerAccountNumber() {
            return sellerAccountNumber;
        }

        public void setSellerAccountNumber(String sellerAccountNumber) {
            this.sellerAccountNumber = sellerAccountNumber;
        }

        public String getBuyerAccountNumber() {
            return buyerAccountNumber;
        }

        public void setBuyerAccountNumber(String buyerAccountNumber) {
            this.buyerAccountNumber = buyerAccountNumber;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    static class Account {
        private String name;
        private String address;
        private String accountNumber;
        private double balance;

        public Account(String name, String address, String accountNumber, double balance) {
            setName(name);
            setAddress(address);
            setAccountNumber(accountNumber);
            setBalance(balance);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
