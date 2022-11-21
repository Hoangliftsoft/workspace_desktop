public class Account{
    private String id;
    private Customer customer;
    private int balance;


    public Customer getCustomer() {
        return customer;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount){
        this.balance+=amount;
    }

    public void debit(int amount){
        if(amount < this.balance){
            this.balance-=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
    }

    public void transferTo(Account another,int amount){
        if(amount < this.balance){
            this.balance-=amount;
            another.balance+=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
    }

    

}