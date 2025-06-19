package prime;

import java.util.Scanner;

public class SimplePrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int i = 2;
        while (i < num) {
            if (num % i == 0)
                break;

            i++;
        }

        if(i == num)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}
