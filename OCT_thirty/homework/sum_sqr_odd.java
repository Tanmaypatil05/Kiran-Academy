package Loop.OCT_thirty.homework;

import java.util.Scanner;

public class sum_sqr_odd {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the start pt:- ");
        int start = T.nextInt();
        System.out.print("Enter the end pt:- ");
        int end = T.nextInt();

        int result = 0;

        for(int i=start;i<=end;i++){
            if(i%2 != 0){
               int sqr = i * i;
               result = result + sqr;
            }

        }
        System.out.print("Square of odd number between "+start+" and "+end+" :"+result);
    }
}
