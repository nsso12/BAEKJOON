package ch01.Basic;

import java.util.Scanner;

public class Basic09 {
    public static void main(String[] args) {
        // (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        // (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int three = (A*(B%10));
       int four = (A*((B%100)/10));
       int five = (A*(B/100));

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(A*B);

        sc.close();

    }
}
