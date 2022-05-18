package online.delivery.application;
import javax.jws.soap.SOAPBinding;
import java.util.Scanner;


public class MainApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("%%%%%%%%%%%%% DDMV FOOD SERVICE %%%%%%%%%%%%%%%");

        DDMV ddmv = new DDMV();
        ddmv.displayorder();



        ddmv.takingorder();

        System.out.println("choose your payment :   1.online  2.cash on delivery");

        ddmv.paymentOption();

        UserPayment userPayment=new UserPayment();
        userPayment.onlinePayment();


    }
}
