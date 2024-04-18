package exsercies2109_OK;

import java.util.Scanner;

public class P06_Chars_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.printf("%c%c%c", first,second,third);

    }
}
