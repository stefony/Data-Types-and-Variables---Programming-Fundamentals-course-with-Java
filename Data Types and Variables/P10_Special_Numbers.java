package exsercies2109_OK;

import java.util.Scanner;

public class P10_Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            int curent = i;
            int sum = 0;

            while (curent>0){
                sum = sum + (curent % 10);
                curent = curent /10;

            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n",i);

            }else {
                System.out.printf("%d -> False%n",i);
            }
        }
    }
}
