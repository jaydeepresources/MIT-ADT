package table;

import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number");
        num = scanner.nextInt();
        System.out.println("Printing table of " + num);
        // 5 * 1 = 5
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " * " + i + " = " + res);
        }
    }
}
