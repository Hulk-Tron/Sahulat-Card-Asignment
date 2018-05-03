public class TransferMealPlanFunds extends Account{

    MealPlan mealplan;

    public TransferMealPlanFunds(int amount){
        int fund  = this.mealplan.getIntialFunds() + amount;
        this.mealplan.setIntialFunds(fund);
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

    public String print(){
        return String.format("%-9d %-14d   %-4d  %-9b", this.mealplan);
    }


}
