package exsercies2109_OK;

import java.util.Scanner;

public class P01_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double km = meters / 1000.0;
        System.out.printf("%.2f",km);
    }
}
