package Loop;

public class sum_even_123_456 {
    public static void main(String[] args){
        int sum=0;
        for(int i=123;i<=456;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
