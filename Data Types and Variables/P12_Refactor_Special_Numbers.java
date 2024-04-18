package exsercies2109_OK;

import java.util.Scanner;
public class P12_Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            int current = number;
            int sum = 0;
            while (current > 0) {
                sum =sum + (current%10);
                current = current / 10;

            }
            }

        }
    }











