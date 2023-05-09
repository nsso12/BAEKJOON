package ch02.If;

import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        //인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
        //또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게
        //훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
        //훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = 60 * A + B;
        min += C;

        //변수 hour에는 min에 저장한 값을 다시 '시'로 환산하여 저장
        int hour = (min/60) % 24;

        //변수 minute에는 min에 저장한 값에서 60으로 나눈 것의 나머지를 저장하여 0~59 사이의 정수로 이루어지는 '분' 값을 도출
        int minute = min%60;

        System.out.println(hour + " " + minute);
    }
}
