package Loop.OCT_thirty.homework;

import java.util.Scanner;

public class cube_odd_num {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("Enter the start pt:- ");
        int start = T.nextInt();
        System.out.print("Enter the end pt:- ");
        int end = T.nextInt();

        long product = 1;

        for(int i=start;i<=end;i++){
            if(i%2 != 0){
                int cube = i*i*i;
                product = product * cube;
            }

        }
        System.out.print("cube of odd number between "+start+" and "+end+" :"+product);
    }
}
