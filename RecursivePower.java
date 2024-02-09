import java.util.Scanner;
public class RecursivePower{

    //recursive method to calculate power 
    public static double power(double base, double exponent){
        if(exponent == 0){      //return 1 if exponent equals 0
            return 1;
        } else if(exponent == 1){   //return base if exponent equals 1
            return base;
        }else{
            return base * power(base, exponent -1); //use recursive funciton to calculate result 
        }
    }
    
    //method to handle negative exponents 
    public static double negativePower(double base, double exponent){
        double denominator = Math.pow(base, Math.abs(exponent)); //calculate denominator using absolute value of exponent 
        return denominator; //return denominator 
    }

    //method to format result in fraction form intead of decimal form
    public static String fractionFormat(double denominator){
        return "1/" + (int)denominator;   //return result in fraction form  and type cast to int
    }

    public static void main(String[]args){
       //scanner obj for user input 
        Scanner scnr = new Scanner(System.in);
        
        //prompt user for base and exponent 
        System.out.print("Enter base: ");
        double base = scnr.nextDouble();

        System.out.print("Enter exponent: ");
        double exponent = scnr.nextDouble();

        //check to see if we're dealing with negative exponent 
        if(exponent< 0){
            double denominator = negativePower(base, exponent); //call method to calculate denominator
            String fraction = fractionFormat(denominator);  //call method to format in fraciton form
            System.out.println("Value is: " + fraction);     //display value 
            //case where exponent is positive
        } else{
            double result = power(base, exponent);  //call method to calculate result 
            System.out.println("Value is: " + result);   //dispaly result 
        }
    }
}