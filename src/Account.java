import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
    private int Balance;
    private List<Transaction> transaction;
    private SahulatCard sahulatCard;

    public Account(){

    }

    public List<Transaction> getTransaction() {
        return transaction;
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
        List<Transaction> transactionsList = new ArrayList<>();
        for (Transaction trans: transaction) {
                if(startDate.compareTo(trans.getDate()) < 0 && trans.getDate().compareTo(endDate) < 0){
                    transactionsList.add(trans);
                    return transactionsList;
                }
                else{
                    return transactionsList;
                }}
        return transactionsList;
    }


    //TO STRING MEHTOD
    public String print(){
        return String.format("%-9d %-14d   %-4d  %-9b", this.sahulatCard.getStudentID(), this.getBalance());
    }
    //TO STRING MEHTOD





}
