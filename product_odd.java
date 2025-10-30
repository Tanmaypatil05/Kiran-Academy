package Loop;

public class product_odd {
    public static void main(String[] args){
        long product=1;
        for(int i=15;i<=30;i++){
            if(i%2!=0){
                product=product*i;
            }

        }
        System.out.println(product);
    }
}
