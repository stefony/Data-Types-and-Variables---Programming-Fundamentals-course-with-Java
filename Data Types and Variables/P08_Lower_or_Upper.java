package exsercies2109_OK;

import java.util.Scanner;

public class P08_Lower_or_Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(symbol)){
            System.out.println("upper-case" );
        }else {
            System.out.println("lower-case");
        }
    }
}
