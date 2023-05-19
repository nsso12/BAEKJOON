package ch04.Array;

import java.io.IOException;
import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) throws IOException {
        //공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
        //1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
        //추후 다시 풀어야 함



        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();
        int temp;    // temp는 자바에서 임시 저장 공간을 칭하는 변수

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;   // 첫번째는 0이지만 첫번째 바구니이기 때문에
        }

        for(int j=0; j<M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[j-1] = temp;
        }

        for(int k=0; k<arr.length; k++) {
            System.out.println(arr[k]+ " ");
        }

    }
}
