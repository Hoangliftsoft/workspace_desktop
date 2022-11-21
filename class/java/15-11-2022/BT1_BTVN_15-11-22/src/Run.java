public class Run {
    public static void main(String[] args) throws Exception {
        Customer customer_1 = new Customer(1, "Pham Quoc Hoang", 10);
        Customer customer_2 = new Customer(2, "Pham Quoc Hoang2", 20);
        InVoice v = new InVoice(11, customer_1, 5000);

        System.out.println("\nBefore " + v.toString());
        System.out.println("\nCustomer: " + customer_1.toString());
        System.out.println("\nID: " + v.getId());
        v.setCustomer(customer_2);
        System.out.println("Amount: " + v.getAmount());

        v.setAmount(15);
        System.out.println("CustomerID: " + v.getCustomerId());
        System.out.println("CustomerName: " + v.getCustomerName());
        System.out.println("CustomerDiscount: " + v.getCustomerDiscount());
        System.out.println("Amount after discount: " + v.getAmountAfterDiscount());
        System.out.println("\nAfter " + v.toString());

    }
}
