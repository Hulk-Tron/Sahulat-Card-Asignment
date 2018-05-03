import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private int amount;

    public Date getDate() {
        return date;
    }

    public Transaction(String type, int amount, Date date){
        this.date = date;
        this.type = type;
        this.amount = amount;
    }
}
