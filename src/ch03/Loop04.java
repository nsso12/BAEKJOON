package ch03;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        //구매한 각 물건의 가격과 개수, 구매한 물건들의 총 금액
        //을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
        //구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int a = 0;
        int b = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sum += a * b;
        }

        if (sum == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
