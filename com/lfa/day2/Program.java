package com.lfa.day2;
import com.lfa.day2.util.PriceCalculator;
import java.util.Scanner;

public class Program{

    private static void menu(){
        System.out.println("1. Shop Open");
        System.out.println("2. Report");
        System.out.println("3.Exit");
        System.out.println("Enter your choice:");
    }

    private  static void entry(Scanner input,String[] products,double[] prices,int[] quantity){
        for(int i=0;i<products.length;i++){
            System.out.printf("Enter the price for %s:",products[i]);
            prices[i]=input.nextDouble();
            System.out.printf("Enter the Quantity for %s:",products[i]);
            quantity[i]=input.nextInt();
        }
    }

    private static void report(String[] products,double[]prices,int[] quantity){
        System.out.println("Product Price Table");
        System.out.println("-----------------------------------------");
        System.out.println("Product Name\tQuantity\tProduct Price\tTotal");
        System.out.println("-----------------------------------------");

        double grandTotal=0;
        for(int i=0;i<products.length;i++){

        double total=quantity[i] * prices[i];
        System.out.printf("%s\t%d\t%f\t%f\r\n",
                products[i],quantity[i],prices[i],total);
        //System.out.println();
        grandTotal +=total;
        }

        System.out.println("Grand Total:" + grandTotal);
        
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String[] products={"TV","DVD","AC"};
        int size=products.length;
        double[] prices=new double[size] ;
        int quantity[] =new int[size];

        while(true){
            menu();
            int choice=input.nextInt();
            if(choice==1){
                entry(input,products,prices,quantity);

            }else if(choice==2){
                report(products,prices,quantity);
            }else{
                System.exit(0);
            }
        }

        

        
    }
}