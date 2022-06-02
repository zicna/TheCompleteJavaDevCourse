public class BankAccountManager{
    public static void checkAccount(BankAccount obj) throws InvalidAccountNumberException{
        if(obj.accountNumber == 123456789){
            System.out.println("All is good");
        }else{
            throw new InvalidAccountNumberException("Bank Account number is not valid");
        }
    }
}