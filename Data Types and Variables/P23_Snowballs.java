package exsercise2309_OK;

import java.util.Scanner;

public class P23_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int firsPower = power;
        int countPoke = 0;

        while (power>=distance){
        power = power-distance;
        countPoke++;
        if (power==firsPower/2){
            if (factor!=0){
                power= power/factor;
            }
        }
   }
        System.out.println(power);
        System.out.println(countPoke);
    }
}
