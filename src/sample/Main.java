package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

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
        Player temp = new Player();
        temp.getScore();

        System.out.println("hello Jen you Sexy Spicy girl.");
//        launch(args);
    }
}
