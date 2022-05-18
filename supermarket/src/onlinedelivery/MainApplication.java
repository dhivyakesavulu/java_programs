package onlinedelivery;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("%%%%%%%%%%%%%%%%%%% DMSTORE %%%%%%%%%%%%%");
        System.out.println("List OF Grocery Items");
        System.out.println();
        DMstore dMstore=new DMstore();
        dMstore.displayorder();
        dMstore.takingorder();
    }

}
