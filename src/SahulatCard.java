import java.util.*;

//SAHULAT CARD VARIABLE INTIALIZATION
public class SahulatCard extends Student{
private String barcode;
private String PIN;
private Boolean active;
private Date expiry;
private Student student;
private FlexRupees balance;
private ArrayList<Account> accounts = new ArrayList<Account>();
private MealPlanFunds mealPlanFund;
//private Account[] accounts = new Account[5];
//SAHULAT CARD VARIABLE INTIALIZATION


//SAHULAT CARD CONSTRUCTOR
public SahulatCard(Student studentID){

    //CREATING EXPIRATION DATE
    Calendar currentCalendar = Calendar.getInstance();
    currentCalendar.add(Calendar.YEAR,2);
    //CREATING EXPIRATION DATE

    this.student = studentID;
    this.barcode = UUID.randomUUID().toString().replace("-","");
    this.PIN = "";
    this.active = false;
    this.expiry = currentCalendar.getTime();
    this.balance = new FlexRupees(0.00);

//    accounts.add(this);

}
    //SAHULAT CARD CONSTRUCTOR

    //TO STRING MEHTOD
    public String toString(){
        return String.format(this.student.getStudentID(), this.barcode, this.PIN, this.active);
    }
    //TO STRING MEHTOD


                        //PURCHASE METHOD
                        public Boolean purchase(int amount){
                        if(mealPlanFund.purchase(amount)){
                            System.out.println("Purchase Succesfull");
                            return true;
                        }
                        if(balance.purchase(amount)){
                            System.out.println("Purchase From Flexaccount succefull");
                            return true;
                        }
                        else{
                            System.out.println("Insufficient balance in both account");
                            return false;
                            }
                        }
                        //PURCHASE METHOD




                    //ADD MEAL PLAN
                    public void addMealPlan(MealPlan mealPlan){
                    this.accounts.add(new MealPlanFunds(mealPlan));
                    }
                    //ADD MEAL PLAN



                    //END OF MEAL PLAN
                    public void endOfMealPlan(){
                        mealPlanFund.mealplan = null;
                    }
                    //END OF MEAL PLAN




                //ADD RUPEES TO FLEX ACCOUNT
                public void addRupees(int amount){
                int newfund = balance.getBalance() + amount;
                balance.setBalance(newfund);
                }
                //ADD RUPEES TO FLEX ACCOUNT





                //TRANSACTION HISTORY
    public List<Transaction> transactionHistory(Date startDate, Date endDate){
        List<Transaction> transactionsList = new ArrayList<>();
        for (Account account: accounts) {
                for (Transaction transaction: account.getTransaction()) {
                if(startDate.compareTo(transaction.getDate()) < 0 && transaction.getDate().compareTo(endDate) < 0){
                    transactionsList.add(transaction);
                    return transactionsList;
                }
                else{
                    return transactionsList;
                }}}
                    return transactionsList;
    }
                //TRANSACTION HISTORY

}
