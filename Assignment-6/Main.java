import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double amount=scan.nextDouble();
        Delivery d;
        if(n==1){
            d=new RegularDelivery(amount);
        }
        else{
            d=new ExpressDelivery(amount);
        }
        System.out.printf("%.2f",d.calculateDeliveryCharge());
    }
}

