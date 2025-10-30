package Loop.OCT_thirty;

import java.util.Scanner;

public class print_cube {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the term:- ");
        int n = T.nextInt();

        for(int i=1;i<=n;i++){
            int result = i*i*i;
            System.out.print(result+" ");
        }

    }
}
