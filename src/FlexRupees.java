public class FlexRupees extends Account{
    private double flexbalance;
    public FlexRupees(double amount){
        this.flexbalance = amount;
    }

    public Boolean purchase(int amount){
        if(flexbalance > amount){
            this.flexbalance -= amount;
            return true;
        }
        else{
            System.out.println("Insufficient Balance");
            return true;
        }
    }

    public void deposit(int amount){
        this.flexbalance += amount;
    }

    //TO STRING MEHTOD
    public String print(){
        return String.format("%-9d %-14d   %-4d  %-9b", this.flexbalance);
    }
    //TO STRING MEHTOD


}