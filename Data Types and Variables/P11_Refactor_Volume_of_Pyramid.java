package exsercies2109_OK;

import java.util.Scanner;

public class P11_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Length: ");
        double lenght = Double.parseDouble(scanner.nextLine());
       System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double heiht = Double.parseDouble(scanner.nextLine());
        heiht = (lenght * width * heiht) / 3;
        System.out.printf("Pyramid Volume: %.2f", heiht);

    }
}
