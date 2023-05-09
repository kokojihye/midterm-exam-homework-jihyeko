package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    public void sum1To10() {
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void sumEven1To100() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                sum += i;
            }
            System.out.println(sum);
        }
    }

    public void oneGugudan() {
        System.out.println("정수를 하나 입력받아, 그 수의 구구단 출력하기");
        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();
        System.out.println(num + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i +"="+ num * i);
        }
    }

    public void sumMinToMax() {
        //System.out.println("두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("정수를 입력하세요: ");
        int num2 = sc.nextInt();

        int min, max;
        int sum = 0;
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            sum += i;
        }
    }

    public void printStar() {
    }

    public void printNumberStar() {
    }

    public void printTriangleStar() {
    }

    public void guguDan() {
    }
}
