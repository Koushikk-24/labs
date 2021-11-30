//Write a program to accept five strings separately, concatenate and display them as a single string. 
import java.util.Scanner;
public class lab9_03 {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 strings");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }
        System.out.println(str);
    }
}
