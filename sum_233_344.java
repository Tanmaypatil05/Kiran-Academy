package Loop;

public class sum_233_344 {
    public static void main(String[] args){
        long sum=1;
        for(int i=233;i<=344;i++){
            if(i%4==0 && i%7==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
