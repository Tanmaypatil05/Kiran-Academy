package Loop;

public class product_even {
    public static void main(String[] args){
        long product=1;
        for(int i=12;i<=33;i++){
            if(i%2==0){
                product=product*i;
            }

        }
        System.out.println(product);
    }
}
