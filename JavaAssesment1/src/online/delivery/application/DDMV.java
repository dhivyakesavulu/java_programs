package online.delivery.application;
import java.util.Scanner;


public class DDMV {


        static int cartT = 0;
        Scanner sc = new Scanner(System.in);

        String[] nonVegFood = new String[]{"CHICKEN BIRYANI", "MUTTON BIRYANI", "FISH BIRYANI", "CHICKEN LOLLIPOP", "CHICKEN DRUMSTICK", "CHICKEN MANCHURIA", "CHIILI CHICKEN", "CHICKEN 65", "MUTTON TIKKA", "FISH TIKKA", "PIZZA", "BURGER", "SPRING ROLL", "VEG BIRYANI", "PANEER BIRYANI", "MUSHROOM BIRYANI", "GOBI RICE", "PANEER CHILLY DRY", "VEG MANCHURIYA", "PANEER TIKKA", "TANDOORI AALU", "TANDOORI MUSHROOM", "VEG KEEMA", "DOUBLE KA METHA", "FRUIT SALAD", "ICE CREAM", "BADHAM MILK", "MANGO MILK SHAKE", "BROWNIES", "RASMALAI", "GULAB JAMUM"};
        int[] nonprize = new int[]{200, 250, 270, 190, 180, 150, 160, 180, 200, 210, 200, 175, 150, 120, 150, 175, 150, 125, 130, 150, 175, 200, 250, 300, 150, 100, 120, 160, 200, 250, 100};

        void displayorder() {
            for (int i = 0; i < nonVegFood.length; i++) {
                System.out.println(i + 1 + " " + nonVegFood[i] + "=== " + nonprize[i]);
            }
        }

        void takingorder() {

            int cart = 0;

            System.out.println("enter your order : ");
            for (int i = 0; i < 100; i++) {
                switch (sc.nextInt()) {


                    case 1:
                        System.out.println(nonVegFood[0]);
                        System.out.println(nonprize[0]);
                        cart += nonprize[0];

                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 2:

                        System.out.println(nonVegFood[1]);
                        System.out.println(nonprize[1]);
                        cart += nonprize[1];

                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 3:
                        System.out.println(nonVegFood[2]);
                        System.out.println(nonprize[2]);
                        cart += nonprize[2];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");


                        break;
                    case 4:
                        System.out.println(nonVegFood[3]);
                        System.out.println(nonprize[3]);
                        cart += nonprize[3];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 5:
                        System.out.println(nonVegFood[4]);
                        System.out.println(nonprize[4]);
                        cart += nonprize[4];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 6:
                        System.out.println(nonVegFood[5]);
                        System.out.println(nonprize[5]);
                        cart += nonprize[5];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 7:
                        System.out.println(nonVegFood[6]);
                        System.out.println(nonprize[6]);
                        cart += nonprize[6];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 8:
                        System.out.println(nonVegFood[7]);
                        System.out.println(nonprize[7]);
                        cart += nonprize[7];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 9:
                        System.out.println(nonVegFood[8]);
                        System.out.println(nonprize[8]);
                        cart += nonprize[8];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 10:
                        System.out.println(nonVegFood[9]);
                        System.out.println(nonprize[9]);
                        cart += nonprize[9];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 11:
                        System.out.println(nonVegFood[10]);
                        System.out.println(nonprize[10]);
                        cart += nonprize[10];
                        System.out.println("your cart : " + cart + " anything sir yes or no");
                        break;
                    case 12:
                        System.out.println(nonVegFood[11]);
                        System.out.println(nonprize[11]);
                        cart += nonprize[11];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 13:
                        System.out.println(nonVegFood[12]);
                        System.out.println(nonprize[12]);
                        cart += nonprize[12];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 14:
                        System.out.println(nonVegFood[13]);
                        System.out.println(nonprize[13]);
                        cart += nonprize[13];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 15:
                        System.out.println(nonVegFood[14]);
                        System.out.println(nonprize[14]);
                        cart += nonprize[14];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 16:
                        System.out.println(nonVegFood[15]);
                        System.out.println(nonprize[15]);
                        cart += nonprize[15];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 17:
                        System.out.println(nonVegFood[16]);
                        System.out.println(nonprize[16]);
                        cart += nonprize[16];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 18:
                        System.out.println(nonVegFood[17]);
                        System.out.println(nonprize[17]);
                        cart += nonprize[17];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 19:
                        System.out.println(nonVegFood[18]);
                        System.out.println(nonprize[18]);
                        cart += nonprize[18];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 20:
                        System.out.println(nonVegFood[19]);
                        System.out.println(nonprize[19]);
                        cart += nonprize[19];
                        System.out.println("your cart : " + cart + " anything sir yes or no");
                        break;

                    case 21:
                        System.out.println(nonVegFood[20]);
                        System.out.println(nonprize[20]);
                        cart += nonprize[20];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 22:
                        System.out.println(nonVegFood[21]);
                        System.out.println(nonprize[21]);
                        cart += nonprize[21];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;

                    case 23:
                        System.out.println(nonVegFood[22]);
                        System.out.println(nonprize[22]);
                        cart += nonprize[22];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 24:
                        System.out.println(nonVegFood[23]);
                        System.out.println(nonprize[23]);
                        cart += nonprize[23];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 25:
                        System.out.println(nonVegFood[24]);
                        System.out.println(nonprize[24]);
                        cart += nonprize[24];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 26:
                        System.out.println(nonVegFood[25]);
                        System.out.println(nonprize[25]);
                        cart += nonprize[25];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 27:
                        System.out.println(nonVegFood[26]);
                        System.out.println(nonprize[26]);
                        cart += nonprize[26];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 28:
                        System.out.println(nonVegFood[27]);
                        System.out.println(nonprize[27]);
                        cart += nonprize[27];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 29:
                        System.out.println(nonVegFood[28]);
                        System.out.println(nonprize[28]);
                        cart += nonprize[28];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 30:
                        System.out.println(nonVegFood[29]);
                        System.out.println(nonprize[29]);
                        cart += nonprize[29];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    case 31:
                        System.out.println(nonVegFood[30]);
                        System.out.println(nonprize[30]);
                        cart += nonprize[30];
                        System.out.println("your cart : " + cart + "  anything sir yes or no");
                        break;
                    default:
                        System.out.println("please provide right order ");

                }

                cartT = cart;

                String s = sc.next();
                String y = "yes";
                String n = "no";

                if (s.equals(y))
                    System.out.println("enter order : ");
                else if (s.equals(n))
                    break;


            }
        }


        void paymentOption() {

            switch (sc.nextInt()) {
                case 1:
                    System.out.println(cartT + " make your payment : ");
                    break;
                case 2:
                    System.out.println(cartT + " keep change");
                    break;
            }

        }

    }