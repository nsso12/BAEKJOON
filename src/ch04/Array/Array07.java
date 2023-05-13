package ch04.Array;

import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        //학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
        //교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
        //출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int [31];

        for(int i=1; i<29; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] != 1)
                System.out.println(i);

        }
        sc.close();
    }
}
