//Write a program that inputs a telephone number as a string in the form (555) 555-5555. Use String method to extract the area code as a token, the first three digits of the phone number as a token and the last four digits of the phone number as a token. Display area code and seven digit phone number separately. 
import java.util.Scanner;
public class lab9_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a telephone number");
        String num = sc.nextLine();
        String areaCode = num.substring(1, 4);
        String firstThree = num.substring(6, 9);
        String lastFour = num.substring(10, 14);
        System.out.println("Area code: " + areaCode);
        System.out.println("First three digits: " + firstThree);
        System.out.println("Last four digits: " + lastFour);
    }
    
}
