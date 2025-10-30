package Loop;

public class sum_odd_321_555 {
    public static void main(String[] args){
        int sum=0;
        for(int i=321;i<=555;i++){
            if(i%2!=0){
                sum=sum + i;
            }

        }
        System.out.println(sum);
    }
}
