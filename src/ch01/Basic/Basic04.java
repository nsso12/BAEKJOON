package ch01.Basic;

import java.util.Scanner;

public class Basic04 {
    public static void main(String[] args) {

        //두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
        // 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A/B);

        sc.close();
    }
}
