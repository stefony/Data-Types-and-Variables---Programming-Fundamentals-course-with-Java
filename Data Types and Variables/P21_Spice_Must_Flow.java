package exsercise2309_OK;

import java.util.Scanner;

public class P21_Spice_Must_Flow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int total = 0;

        while (startingYield>=100){
            int spice = startingYield-26;
            total= total+spice;
            days++;
            startingYield=startingYield-10;
        }
        System.out.println(days);
        if (total>=25){
            total=total-26;
        }
        System.out.println(total);
    }
}
