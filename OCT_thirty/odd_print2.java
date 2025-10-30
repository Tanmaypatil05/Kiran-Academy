package Loop.OCT_thirty;

import java.util.Scanner;

public class odd_print2 {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter the term:- ");
        int n = T.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

    }
}
