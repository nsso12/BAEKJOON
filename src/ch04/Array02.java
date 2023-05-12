package ch04;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
        //X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 배열 속 숫자의 갯수
        int X = sc.nextInt();  // 배열 속 숫자와 비교할 숫자
        int[] arr = new int[N];  // N개의 자리가 있는 배열 생성

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt(); // 직접 입력 할 배열 속에 들어갈 숫자
            if(arr[i]<X) {
                System.out.print(arr[i] + " ");
            }
        }



    }
}
