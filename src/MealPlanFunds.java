import com.sun.org.apache.xpath.internal.operations.Bool;

public class MealPlanFunds extends Account{
    MealPlan mealplan;

    public MealPlanFunds(MealPlan mealPlan){
    this.mealplan = mealPlan;
    }

    public void addMealPlan(MealPlan mealPlan){
        this.mealplan = mealPlan;
    }

    public void endMealPlan(Account toAccount){
        this.mealplan = null;
        this.setBalance(this.getBalance()+mealplan.getIntialFunds());
    }

    @Override public Boolean purchase(int amount){
        if(this.getBalance() > amount){
            int purchase = amount - mealplan.getDiscount();
            this.setBalance(this.getBalance()+purchase);
            return true;
        }
        else{
            System.out.println("Insufficient Funds");
            return false;
        }
    }

//    DISCOUNT
    public void discount(){

    }
//    DISCOUNT

    public String print(){
        return String.format("%-9d %-14d   %-4d  %-9b", this.mealplan);
    }



}
