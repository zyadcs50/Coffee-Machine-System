//
//// Machine will have turkish coffee => 25 pounds spresso => 40 pounds cappichno => 50 pounds
//// it should have method to get the money in it
//// method to order a choice from those three drinks
//// get the money from user and check if the money is less or more or exactly equal the price of the drink and
//// if it is more check if there change or not
//
//import java.util.Scanner;
//class Coffee_machine{
//    private int DefaultMoney = 200;
//
//
//    Coffee_machine(){
//        System.out.println("☕ Hello This is your Coffee Machine...");
//        System.out.println("1. Turkish Coffee - 25 EGP");
//        System.out.println("2. Espresso       - 40 EGP");
//        System.out.println("3. Cappuccino     - 50 EGP");
//    }
//
//    public int price(int x){
//        if(x == 1){
//            return 25;
//        }
//        else if(x == 2){
//            return  40;
//        }
//
//        else if(x == 3){
//            return 50;
//        }
//
//        else{
//            return -1;
//        }
//
//    }
//
//    public void calculate_price(int choice, int money){
//        int pr = price(choice);
//
//        if (money < pr){
//            System.out.println("Your money is less than the Price of the drink, the money required: " + pr);
//        }
//
//        if(money == pr){
//            DefaultMoney = DefaultMoney + pr;
//            Drink_msg(choice);
//        }
//
//        if(money > pr){
//            int change = money - pr;
//            if(DefaultMoney >= change){
//                DefaultMoney = DefaultMoney + pr;
//                DefaultMoney = DefaultMoney - change;
//                Drink_msg(choice);
//                System.out.println("💸 your Change is: " + change);
//            }
//
//            else{
//                System.out.println("😔 Sorry, No enough Change");
//            }
//        }
//
//
//    }
//
//    public void Drink_msg(int choice){
//        if(choice == 1){System.out.println("Here is your Turkish Coffee ☕");}
//        if (choice == 2){System.out.println("Here is your Espresso ☕");}
//        if(choice == 3){System.out.println("Here is your Cappuccino ☕");}
//    }
//
//    public void Show_money_in_machine(){
//        System.out.println("The money: " + DefaultMoney + "EGP");
//    }
//
//
//}
//
//
//public class machine {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Coffee_machine c = new Coffee_machine();
//
//        boolean MachineON = true;
//
//        while (MachineON){
//            System.out.print("What is your Choice? (1-3) or 0 to exit: ");
//            int choice = input.nextInt();
//            if(choice == 0){
//                System.out.println("Thanks For Using our CoffeeMachine");
//                return;
//            }
//            if(choice < 0 || choice > 3){
//                System.out.println("Please choose from 1 to 3... or 0 to exit");
//                continue;
//            }
//            System.out.print("Put money in machine: ");
//            int money = input.nextInt();
//            c.calculate_price(choice, money);
//        }
//    }
//}
//
//
//
//
//
//
//
