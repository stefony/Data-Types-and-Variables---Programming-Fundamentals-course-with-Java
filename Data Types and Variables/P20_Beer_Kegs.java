package exsercise2309_OK;

import java.util.Scanner;

public class P20_Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        int numberKegs = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=numberKegs ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;
            if (volume>maxVolume){
               maxVolume=volume;
               maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
