//Develop a program for searching a student from a class. Assume a set of 10 students with their details as Registration number, First Name, Last Name and Degree in an array of Student objects. Search a student either by First Name or Last Name. 


import java.util.Scanner;
class Student {
    int regNo;
    String fName, lName;
    String degree;
}

public class lab9_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("Enter registration number");
            s[i].regNo = sc.nextInt();
            System.out.println("Enter first name");
            s[i].fName = sc.next();
            System.out.println("Enter last name");
            s[i].lName = sc.next();
            System.out.println("Enter degree");
            s[i].degree = sc.next();
        }
        System.out.println("Enter first name or last name of student");
        String name = sc.next();
        for (int i = 0; i < n; i++) {
            if (s[i].fName.equals(name) || s[i].lName.equals(name)) {
                System.out.println("Student found");
                System.out.println("Registration number: " + s[i].regNo);
                System.out.println("First name: " + s[i].fName);
                System.out.println("Last name: " + s[i].lName);
                System.out.println("Degree: " + s[i].degree);
            }
        }

    }
}
