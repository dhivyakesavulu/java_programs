//Write a progarm and use all different Datatypes and assign some default vlues and change the values
// later and print before change ang after change.(Also swap any of the two numbers of your choice)
//Example: int i=10,int j=20, float a=4.5 ,float b=4.0
//After swaping: i=20 ,j=10 ,and a=4.0,b=4.5

package assesment;
public class Datatypes {
    public static void main(String[] args) {
        char ch1= '2' ;
        char ch2= '3' ;
        char ch3=ch1;
        System.out.println ("char= " + ch1);
        System.out.println("Before swapping");
        System.out.println("  ch1= " + ch1);
        System.out.println("  ch2= " + ch2);
        ch1=ch2;
        ch2=ch3;
        System.out.println("After swapping");
        System.out.println("  ch1= " + ch1);
        System.out.println("  ch2= " + ch2);

        short sh= 34;
        System.out.println("short= " + sh);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3=b1;
        System.out.println("boolean= " + b1);
        System.out.println("Before swapping");
        System.out.println("  b1= " + b1);
        System.out.println("  b2= " + b2);
        b1=b2;
        b2=b3;
        System.out.println("After swapping");
        System.out.println("  b1= " + b1);
        System.out.println("  b2= " + b2);
        byte bt=56;
        System.out.println("byte= " + bt );
        long number=999999999l;
        System.out.println("long= " + number);
        float f1=4.0f;
        System.out.println("float= " + f1);
        double d1=58.9d;
        System.out.println("double= " + d1);
        int i=10;
        int j=20;
        System.out.println("int= " + i);
        System.out.println("Before swapping ");
        System.out.println("  i= " + i);
        System.out.println("  j= " + j);
        int temp =i;
        i=j;
        j=temp;
        System.out.println("After swapping");
        System.out.println("  i= " + i);
        System.out.println("  j= " + j);


    }
}
