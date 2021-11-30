import java.util.Scanner;

//Write a program to accept an array of strings and arrange them in alphabetical order.


class lab9_01 {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 strings");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
}
