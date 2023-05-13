package ch03.Loop;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {
        //N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
        //출력형식과 같게 N*1부터 N*9까지 출력한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;

        for(num=1; num<10; num++) {
            System.out.println(N + " * " + num + " = " + N*num);

        }
    }
}
