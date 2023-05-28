package ch05.String;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        //문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // 테스트 케이스 개수

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
        }

        sc.close();

    }
}
