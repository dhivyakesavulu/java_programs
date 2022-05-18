package onlinedelivery;

import java.util.Scanner;

public class DMstore {

     Scanner scanner=new Scanner(System.in);
    String[] grocery=new String[]{"cocking oil","soap","chilly power","turmaric power","surfexcel","shampoo","onion","tomato","carrot","potato","apple","kiwi","papaya"};
    int[] price=new int[]{200,50,250,100,250,100,50,70,30,50,150,300,300,100};

    void displayorder() {

        for ( int i=0; i< grocery.length;i++){
            System.out.println(i + 1+ "  "+ grocery[i]+" == " + price[i]);
        }
    }
    void takingorder(){
            int cart=0;
        System.out.println("enter your order: ");
        for(int i = 0 ; i < 100 ; i++){
        switch(scanner.nextInt()){

            case 1:
                System.out.println(grocery[0]);
                System.out.println(price[0]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[0];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

        }
    }

}}
