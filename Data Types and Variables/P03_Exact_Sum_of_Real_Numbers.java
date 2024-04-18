package exsercies2109_OK;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_Exact_Sum_of_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal sum = new BigDecimal(0);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum=sum.add(currentNum);

        }
       System.out.println(sum);

    }
}
