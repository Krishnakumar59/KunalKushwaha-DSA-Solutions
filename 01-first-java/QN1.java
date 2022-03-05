import java.util.*;

public class QN1{
    public static void main(String[] args) {
        
        //1. Write a program to print whether a number is even or odd, also take input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("Even");
        }else
        System.out.println("Odd");
        //closing scanner
        scanner.close();
    }
}