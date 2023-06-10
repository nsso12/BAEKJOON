package ch05.String;

import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {

        //N개의 숫자가 공백 없이 쓰여있다.
        //이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        sc.close();

        int sum = 0;

        for(int i=0; i<n; i++) {
            sum += str.charAt(i) - 48;
        }

        System.out.println(sum);

    }
}
