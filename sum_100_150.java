package Loop;

public class sum_100_150 {
    public static void main(String[] args){
        long sum=1;
        for(int i=100;i<=150;i++){
            if(i%3==0 && i%5==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
