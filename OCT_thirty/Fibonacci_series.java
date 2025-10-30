package Loop.OCT_thirty;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("how many number you want:- ");
        int n=T.nextInt();

        int a = 0;
        int b = 1;
        System.out.print(a +" "+b);

        for(int i=2;i<n;i++){
            int result = a + b;
            System.out.print(" "+ result);
            a = b;
            b = result;
        }

    }
}
