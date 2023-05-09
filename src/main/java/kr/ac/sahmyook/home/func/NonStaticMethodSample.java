package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner(){
        System.out.println("자료형 종류별로 값 입력받아 출력하기");
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.println("입력한 정수는 " + num1 + "입니다.");

        // 실수 입력받기
        System.out.print("실수를 입력하세요: ");
        double num2 = sc.nextDouble();
        System.out.println("입력한 실수는 " + num2 + "입니다.");

        // 문자열 입력받기
        System.out.print("문자열을 입력하세요: ");
        String str = sc.next();
        System.out.println("입력한 문자열은 " + str + "입니다.");
    }
    public void testRandom(){
        Random random = new Random();

        System.out.println("정수와 실수에 대한 난수 출력하기");

        int randomNum1 = random.nextInt(10);
        System.out.println("정수 난수: " + randomNum1);

        double randomNum2 = random.nextDouble();
        System.out.println("실수 난수: " + randomNum2);
    }
}
