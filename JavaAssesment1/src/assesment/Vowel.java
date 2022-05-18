package assesment;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the alphabet: " );
        char vowel=input.next().charAt(0);
        char[] arr={'a','e','i','o','u','A','E','I','O','U'};
        switch (vowel){
            case 'a':
                System.out.println(vowel + " is a vowel " );
                break;
            case 'e':
                System.out.println(vowel + " is a vowel "  );
                break;
            case 'i':
                System.out.println(vowel + " is a vowel "  );
                break;
            case 'o':
                System.out.println(vowel +" is a vowel "  );
                break;
            case 'u':
                System.out.println(vowel + " is a vowel "  );
                break;
            case 'A':
                System.out.println(vowel + " is a vowel " );
                break;
            case 'E':
                System.out.println(vowel + " is a vowel " );
                break;
            case 'I':
                System.out.println(vowel + " is a vowel " );
                break;
            case 'O':
                System.out.println(vowel + " is a vowel " );
                break;
            case 'U':
                System.out.println(vowel + " is a vowel " );
                break;
            default:
                System.out.println("is a constant");
        }
        String str="welcome";
        char[] chars=str.toCharArray();
        int count=0;
        for (char ch: chars ) {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count++;
        }
        System.out.println("No of vowels : " + count);
    }

}
