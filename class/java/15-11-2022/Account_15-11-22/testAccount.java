public class testAccount {
    public static void main(String[] agrs){
        Account a = new Account("1","Hoang",50000);
        // Account b = new Account("2", "Hoang2", 6000);
        a.credit(1000);
        a.debit(2000);
        // a.transferTo(b, 3000);
        System.out.println(a.toString());
    }
}
