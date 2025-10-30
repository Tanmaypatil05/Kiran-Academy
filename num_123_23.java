package Loop;

public class num_123_23 {
    public static void main(String[] args){
        for(int i=123;i>=23;i--){
            if(i%4==0 && i%7==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
