package sample;

import java.text.NumberFormat;

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
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            Savings=0.00;
            String moneyString = formatter.format(Savings);
            System.out.println("You have broken the bank. The bank now contains "+ moneyString );
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


}
