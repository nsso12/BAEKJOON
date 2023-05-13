package ch05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        //단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
        //S의 i번째 글자를 출력한다.

        Scanner sc= new Scanner(System.in);
        String S = sc.nextLine();

        System.out.println(S.charAt(sc.nextInt()-1));

    }
}
