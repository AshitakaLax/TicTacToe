package sample;

/**
 * Created by jensbaby on 12/23/13.
 */
public class PiggyBank
{
    boolean Broken;
    double Savings;

    public void PiggyBank(){
        Broken=false;
        Savings=0.0;
    }
    public void PiggyBank(double InitialDeposit){
        Broken=false;
        Savings+=InitialDeposit;
    }
    public void CheckBroken(){
        if(Broken==true)
        {
            Savings=0.0;
            System.out.println("You have broken the bank. The bank now contains $");
            System.out.println(Savings);
        }
    }
    public double CountSavings(){
        return Savings;
    }
    public void DepositMoney (double MoneyAdded){
        if(Broken==false){
            if(MoneyAdded>=0){
                Savings+=MoneyAdded;
            }
            else{
                System.out.println("You cannot deposit negative sums.");
            }
        }
        else{
            System.out.println("You cannot put money in a broken bank.");
        }
    }
    public double Smash(){
        Broken=true;
        return Savings;
    }


    public static void main (String[] args){
        PiggyBank myBank=new PiggyBank();
        int i;
        for(i=0; i<5; i++)
        {
            double amount=i+2.5;
            myBank.DepositMoney(amount);
            System.out.println(myBank.CountSavings());
        }
        myBank.Smash();
        myBank.CheckBroken();
    }
}
