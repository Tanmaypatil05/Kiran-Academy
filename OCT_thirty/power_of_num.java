package Loop.OCT_thirty;

import java.util.Scanner;

public class power_of_num {
    public static void main(String[] args){
        Scanner T = new Scanner(System.in);
        System.out.print("give number:- ");
        int num = T.nextInt();
        System.out.print("give power:- ");
        int power = T.nextInt();

        long result = 1;

        for(int i=1;i<=power;i++){
            result=result*num;
        }
        System.out.println(result);

        double r2 =Math.pow(num,power);
        System.out.println(r2);

    }
}
