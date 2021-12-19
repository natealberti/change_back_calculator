import java.util.Scanner;

public class CashRegister{

     public static void main(String []args){
         // std in
         Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
         System.out.println("input: " + input);
         
        // split input str into doubles
        String[] spltStr = input.split(";");
        double price = Double.parseDouble(spltStr[0]);
        double cash = Double.parseDouble(spltStr[1]);
        
        // change needed to be returned
        double change = cash - price;
        
        // case where cash < price
        if(change < 0) {
            System.out.println("ERROR");
            return;
        }
        
        // case where cash == price
        if(change == 0) {
            System.out.println("ZERO");
            return;
        }
        
        // otherwise, find minimum num of bills/coins
        int numOf100s = (int) (change / 100.00);
        change -= numOf100s*100.00;
        
        int numOf50s = (int) (change / 50.00);
        change -= numOf50s*50.00;
        
        int numOf20s = (int) (change / 20.00);
        change -= numOf20s*20.00;
        
        int numOf10s = (int) (change / 10.00);
        change -= numOf10s*10.00;
        
        int numOf5s = (int) (change / 5.00);
        change -= numOf5s*5.00;
        
        int numOf2s = (int) (change / 2.00);
        change -= numOf2s*2.00;
        
        int numOf1s = (int) (change / 1.00);
        change -= numOf1s*1.00;
        
        int numOfHalfDollars = (int) (change / 0.5);
        change -= numOfHalfDollars*0.5;
        
        int numOfQuarters = (int) (change / 0.25);
        change -= numOfQuarters*0.25;
        
        int numOfDimes = (int) (change / 0.1);
        change -= numOfDimes*0.1;
        
        int numOfNickles = (int) (change / 0.05);
        change -= numOfNickles*0.05;
        
        int numOfPennies = (int) (change / 0.01);
        change -= numOfPennies*0.01;
        
        // output
        // alphabetically separated by spaces
        System.out.println(numOfDimes + " " + numOf50s + " " + numOf5s + " " + numOfHalfDollars + " " + numOfNickles + " " + numOf1s + " " + numOf100s + " " + numOfPennies + " " + numOfQuarters + " " + numOf10s + " " + numOf20s + " " + numOf2s);
     }
}
