package Loop.OCT_thirty.homework;

import java.util.Scanner;

public class product_sqr_even {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the start pt:- ");
        int start = T.nextInt();
        System.out.print("Enter the end pt:- ");
        int end = T.nextInt();

        long product = 1;

        for(int i=start;i<=end;i++){
            if(i%2 == 0){
                int sqr = i*i;
                product = product * sqr;
            }

        }
        System.out.print("product of square of even number between "+start+" and "+end+" :"+product);
    }
}
