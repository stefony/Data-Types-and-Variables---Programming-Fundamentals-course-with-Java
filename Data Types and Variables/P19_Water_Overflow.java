package exsercise2309_OK;

import java.util.Scanner;

public class P19_Water_Overflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRow = Integer.parseInt(scanner.nextLine());
        int waterTank = 255;
        int sum = 0;

        for (int i = 1; i <= numberRow; i++) {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());
            sum += quantitiesOfWater;
            if (sum>waterTank) {
                System.out.println("Insufficient capacity!");
                sum-=quantitiesOfWater;
            }
        }
        System.out.println(sum);

    }
    }

