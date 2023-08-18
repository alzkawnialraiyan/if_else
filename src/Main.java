import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner to read input from user
        Scanner read = new Scanner(System.in);
        //greatest number from 3 numbers
        System.out.println("Enter three numbers");
        System.out.println("First number:");
        int num1 = read.nextInt();
        System.out.println("Second number:");
        int num2 = read.nextInt();
        System.out.println("Third number:");
        int num3 = read.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" is greater.");
        }else{
            System.out.println(num3+" is greater.");
        }
    }
}