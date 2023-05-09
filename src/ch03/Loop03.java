package ch03;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        //1부터 n까지 합을 출력한다.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=num; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
