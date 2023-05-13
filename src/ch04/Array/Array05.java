package ch04.Array;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        //공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
        //1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 바구니 개수
        int[] arr = new int[N];  // 바구니에 공을 넣을 횟수
        int M = sc.nextInt();

        for(int i =0; i<M; i++) {
            int I = sc.nextInt();  // I번 바구니부터
            int J = sc.nextInt();  // J번 바구니까지
            int K = sc.nextInt();  // K번 공을 넣음

            for(int j = I-1; j<J; j++) {
                arr[j] = K;
            }
        }

        for(int bag : arr) {
            System.out.print(bag + " ");
        }


    }
}
