
// Machine will have turkish coffee => 25 pounds spresso => 40 pounds cappichno => 50 pounds
// it should have method to get the money in it
// method to order a choice from those three drinks
// get the money from user and check if the money is less or more or exactly equal the price of the drink and
// if it is more check if there change or not

import javax.swing.*; // GUI
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;



class CoffeeMachine{
    private int DefaultMoney = 200;

    // Methods...
    public int price(int x){
        if(x == 0){
            return 25;
        }
        else if(x == 1){
            return  40;
        }

        else if(x == 2){
            return 50;
        }

        else{
            return -1;
        }

    }

    public String Drink_msg(int choice){
        if(choice == 0){return "Here is your Turkish Coffee ";}
        if (choice == 1){return "Here is your Espresso ";}
        if(choice == 2){return "Here is your Cappuccino ";}
        return "Nothing";
    }

    public String calculate_price(int choice, int money){
        int pr = price(choice);

        if (money < pr){
            return "Your money is less than the Price of the drink, the money required: " + pr;
        }

        if(money > pr){
            int change = money - pr;
            if(DefaultMoney >= change){
                DefaultMoney = DefaultMoney + pr;
                DefaultMoney = DefaultMoney - change;

                return Drink_msg(choice) + "💸 your Change is: " + change;

            }


        }

        if(money == pr){
            DefaultMoney = DefaultMoney + pr;
            return Drink_msg(choice);
        }

        return " Sorry no enough Change in the Machine";

    }


    public int Show_money_in_machine(){
        return DefaultMoney;
    }


}


public class Main {
    static void main(String[] args) {
        // GUI Setup
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        String[] options = {"Turkish (25)", "Espresso (40)", "Cappuccino (50)", "Machine balance", "Exit"};
        CoffeeMachine c = new CoffeeMachine();

        while (true){

            int index = JOptionPane.showOptionDialog(
                    null,
                    "choose a drink: ",
                    "My Coffee Machine",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            UIManager.put("OptionPane.messageFont", new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
            UIManager.put("OptionPane.buttonFont", new java.awt.Font("Arial", java.awt.Font.PLAIN, 14));


            // if Exit

            if(index == 4){
                JOptionPane.showMessageDialog(null, "Thanks For using Our Machine");
                return;
            }
            // Machine balance
            if(index == 3){
                JOptionPane.showMessageDialog(null, "Money: " + c.Show_money_in_machine());
                continue;
            }

            String money= JOptionPane.showInputDialog(null, "Put money in machine: ");
            if(money == null){
                continue;
            }

            // handle non positive integar input
            if(!money.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number");
                continue;
            }
            // convert to int
            int user_money;
            user_money = Integer.parseInt(money);
            JOptionPane.showMessageDialog(null, c.calculate_price(index, user_money));



        }

    }
}







