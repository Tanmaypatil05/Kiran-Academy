package Loop.OCT_thirty;

import java.util.Scanner;

public class prime_check {
    public static void main(String[] args){
        Scanner T=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = T.nextInt();
        int count =0;


        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }

        }
        if(count == 2){
            System.out.println(num +" is prime number");
        }
        else{
            System.out.println(num +" is not prime number");
        }
    }
}
