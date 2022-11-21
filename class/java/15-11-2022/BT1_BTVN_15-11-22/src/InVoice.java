// Invoid: Hoá đơn
public class InVoice {
    private int id;
    private Customer customer;
    private double amount;

    public InVoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return getAmount() * (1 + (customer.getDiscount() / 100));
    }

    @Override
    public String toString() {
        return "InVoice: \nID=" + id + "\nCustomerID=" + customer.getId() + "\nCustomerName= " + customer.getName()
                + "\nCustomerDiscount= " + customer.getDiscount() + "\nAmount=" + amount;
    }

}