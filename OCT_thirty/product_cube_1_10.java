package Loop.OCT_thirty;

public class product_cube_1_10 {
    public static void main(String[] args){
        int i=1;
        long product=1;
//        for(int i=1;i<=10;i++){
//            long demo = i*i*i;
//            product = product * demo;
//
//        }
        while(i<=10){
            int cube = i*i*i;
            product = product * cube;

        }
        System.out.println(product);
    }
}
