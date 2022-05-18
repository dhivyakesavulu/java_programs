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

            case 2:

                System.out.println(grocery[1]);
                System.out.println(price[1]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[1];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 3:
                System.out.println(grocery[2]);
                System.out.println(price[2]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[2];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 4:

                System.out.println(grocery[3]);
                System.out.println(price[3]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[3];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 5:
                System.out.println(grocery[4]);
                System.out.println(price[4]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[4];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 6:
                System.out.println(grocery[5]);
                System.out.println(price[5]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[5];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 7:
                System.out.println(grocery[6]);
                System.out.println(price[6]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[6];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 8:
                System.out.println(grocery[7]);
                System.out.println(price[7]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[7];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 9:
                System.out.println(grocery[8]);
                System.out.println(price[8]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[8];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 10:
                System.out.println(grocery[9]);
                System.out.println(price[9]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[9];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 11:
                System.out.println(grocery[10]);
                System.out.println(price[10]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[10];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 12:
                System.out.println(grocery[11]);
                System.out.println(price[11]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[11];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;

            case 13:
                System.out.println(grocery[12]);
                System.out.println(price[12]);
                System.out.println("enter your Grocery Item : ");
                cart +=price[12];
                System.out.println("your cart = "   + cart + "  " + "Do you add any other Items : yes or No");
                break;


        }
    }

}}
