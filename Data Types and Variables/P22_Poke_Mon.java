package exsercise2309_OK;

import java.util.Scanner;

public class P22_Poke_Mon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBolls = Integer.parseInt(scanner.nextLine());
        double max = Double.MIN_VALUE;
        int snowballSnowBig = 0;
        int snowballTimeBig = 0;
        int snowballQualityBig = 0;

        for (int i = 1; i <=countBolls ; i++) {
        int snowballSnow = Integer.parseInt(scanner.nextLine());
         int snowballTime = Integer.parseInt(scanner.nextLine());
         int snowballQuality = Integer.parseInt(scanner.nextLine());
         double snowballValue = Math.pow(snowballSnow/snowballTime,snowballQuality);

         if (snowballValue>max){
            max=snowballValue;
             snowballSnowBig=snowballSnow;
             snowballTimeBig=snowballTime;
             snowballQualityBig=snowballQuality;
         }

        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowBig,snowballTimeBig,max,snowballQualityBig);

    }
}
