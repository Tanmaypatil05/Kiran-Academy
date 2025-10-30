package Loop.OCT_thirty;

import java.util.Scanner;

public class print_sqr {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.println("Enter the term:- ");
        int n = T.nextInt();

        for(int i=1;i<=n;i++){
            int result = i*i;
            System.out.print(result+" ");
        }

    }
}
