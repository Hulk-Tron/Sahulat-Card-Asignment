import java.util.Date;
import java.util.List;

public class Account {
    private int Balance;
    private List<Transaction> transaction;
    private SahulatCard sahulatCard;

    public Account(){

    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public Account(int balance){
        this.Balance = balance;
    }

    public Boolean purchase(int amount){
        if(this.Balance > amount){
            this.Balance -= amount;
            this.transaction.add(new Transaction("credit",amount,new Date()));
            System.out.println("Purchase Succesfull");
            return true;
        }
        else{
            System.out.println("Insufficient Balance");
            return false;
        }
    }

    public List<Transaction> transactionHistory(Date startDate, Date endDate) {
        if(transaction.size() == 0){
            System.out.println("No Transaction Available");
            return transaction;
        }
        else{
            return transaction;
        }
    }
}
