package Loop;

public class cube {
    public static void main(String[] args){
        for(int i=12;i>=1;i--){
            if(i%2!=0){
                int cube = i*i*i;
                System.out.println(cube);
            }
        }
    }
}
