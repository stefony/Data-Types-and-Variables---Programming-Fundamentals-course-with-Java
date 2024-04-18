package exsercise2309_OK;

import java.util.Scanner;

public class P14_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n>0){
            int current = n % 10;
            sum+= current;
            n=n / 10;
        }
        System.out.println(sum);
    }
}
