package ch05.String;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        //알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
        //첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.length());


    }
}
