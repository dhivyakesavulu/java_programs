//Simple calculator using switch statement(+,-,*,/)-input two numbers and take operator and do the respective
//calculation and print the result on the console.Example: int a=20,j=10,operator=+; Output=30.

package assesment;
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        char operator;
        int num1,num2,add,sub,mul,div;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1: " );
        num1=input.nextInt();
        System.out.print("Enter the num2: " );
        num2=input.nextInt();
        System.out.println("choose the operator: + ,-,* or / ");
        operator=input.next().charAt(0);
        switch (operator){
            case '+':
                add=num1+num2;
                System.out.println("num1+num2= " + add );
                break;
            case '-':
                sub=num1-num2;
                System.out.println("num1-num2= " + sub );
                break;
            case '*':
                mul=num1*num2;
                System.out.println("num1*num2= " + mul );
                break;
            case '/':
                div=num2/num1;
                System.out.println("num2/num1= " + div );
                break;
            default:
                System.out.println("Error");
        }

    }
}







