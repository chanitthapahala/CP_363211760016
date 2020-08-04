package Lab2;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.print("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("your name is "+name);


        String A ;
        System.out.print("What is your Major? : ");
        A = scanner.nextLine();
        System.out.println(" your Major is "+A);

        System.out.print("Hoe old are ? :");
        String age = scanner.nextLine();
        System.out.println("your age is "+age);

        System.out.print("What is your gmail ? :");
        String gmail = scanner.nextLine();
        System.out.println("your gmail is "+gmail);














    }//main
}//class
