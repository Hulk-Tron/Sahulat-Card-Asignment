import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

//SAHULAT CARD VARIABLE INTIALIZATION
public class SahulatCard extends Student{
private String barcode;
private String PIN;
private Boolean active;
private Date expiry;
private Student student;
private FlexRupees balance;
private Collection<Account> accounts;
//private Account[] accounts = new Account[5];
//SAHULAT CARD VARIABLE INTIALIZATION


//SAHULAT CARD CONSTRUCTOR
public SahulatCard(Student studentID){

    //CREATING EXPIRATION DATE
    Calendar currentCalendar = Calendar.getInstance();
    currentCalendar.add(Calendar.YEAR,2);
    //CREATING EXPIRATION DATE

    student = studentID;
    barcode = UUID.randomUUID().toString().replace("-","");
    PIN = "";
    active = false;
    expiry = currentCalendar.getTime();
    balance = new FlexRupees(0.00);
    }
    //SAHULAT CARD CONSTRUCTOR

    //TO STRING MEHTOD
    public String toString(){
    return String.format("%-9d %-14d   %-4d  %-9b", this.student.getStudentID(), this.barcode, this.PIN, this.active);
    }
    //TO STRING MEHTOD


    //PURCHASE METHOD
    public Boolean purchase(){
    return true;
    }
    //PURCHASE METHOD




    //ADD MEAL PLAN
    public void addMealPlan(MealPlan mealPlan){
    this.accounts.add(new MealPlanFunds(mealPlan));
    }
    //ADD MEAL PLAN



    //END OF MEAL PLAN

    //END OF MEAL PLAN

    //ADD RUPEES TO FLEX ACCOUNT

    //ADD RUPEES TO FLEX ACCOUNT

    //TRANSACTION HISTORY

    //TRANSACTION HISTORY

}
