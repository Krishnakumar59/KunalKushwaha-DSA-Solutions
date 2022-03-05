import java.util.Scanner;

public class QN2 {
    public static void main(String[] args) {
//        2. 2. Take name as input and print a greeting message for that name.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Good Morning "+name+"\nHava a Nice Day !!!");
        scanner.close();
    }
}
