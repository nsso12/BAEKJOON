package ch03;

import java.util.Scanner;

public class Loop11 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        //각 테스트 케이스마다 A+B를 출력한다.

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(0<A && B<10) {
                System.out.println(A+B);
            }

        }
    }
}
