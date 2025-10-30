package Loop.OCT_thirty.homework;

import java.util.Scanner;

public class count_prime_range {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the start pt:- ");
        int start = T.nextInt();
        System.out.print("Enter the end pt:- ");
        int end = T.nextInt();
        int count2 = 0;

        for(int i=start;i<=end;i++){
            int count = 0;

            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }

            }
            if(count ==2) {
                count2++;
            }

        }
        System.out.println("Total Prime num:- "+count2);

    }
}
