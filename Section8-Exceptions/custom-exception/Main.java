public class Main{
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount(12345678);
        try {
            BankAccountManager.checkAccount(newAccount);
            
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}