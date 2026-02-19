import java.util.Scanner;
public class compoundinterest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double principle;
        double rate;
        int timesCompounded;
        int year;
        double amount;
        System.out.print("Enter the principal:");
        principle =sc.nextDouble();
        System.out.print("Enter the rate:");
        rate=sc.nextDouble()/100;
        System.out.print("Enter the time:");
        timesCompounded=sc.nextInt();
        System.out.print("Enter the years:");
        year=sc.nextInt();
        amount=principle*Math.pow(1+rate/timesCompounded,timesCompounded*year);
        System.out.print("Total amount:"+amount);
    
        sc.close();
    }
    
}
