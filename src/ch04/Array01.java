package ch04;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        //총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
        //첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for(int i=0; i<arr.length; i++) {
            if(v == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
