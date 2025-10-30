package Loop.OCT_thirty;

import java.util.Scanner;

public class odd_print {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the term:- ");
        int n = T.nextInt();

        int count = 0;
        int num = 1;
        System.out.println("First " + n + " odd numbers are:");

        while (count < n) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }

    }
}
