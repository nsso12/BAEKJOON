package ch03.Loop;

import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        //하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
        //첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
        // 추후 도전 예정

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.println(" ");
            }
            for(int j =0; j<i; j++){

            };


        }
    }
}
