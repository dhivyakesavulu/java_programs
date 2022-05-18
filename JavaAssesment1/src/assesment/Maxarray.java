package assesment;

public class Maxarray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,89};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr [i] >max)
                max=arr[i];
        }
        System.out.println("Maximum number: " + max);
        for (int i = 0;  i < arr.length ; i++) {
            if(arr [i] <min)
                min=arr[i];
        }
        System.out.println("Minimum number: " + min);

    }

}

