package ch03;

import java.util.Scanner;

public class Loop05 {
    public static void main(String[] args) {
        //혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(i%4==0) {
                System.out.println("long");
            }
        }
        System.out.println("int");
    }
}
