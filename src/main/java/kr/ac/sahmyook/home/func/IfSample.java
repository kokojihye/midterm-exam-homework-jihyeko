package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    public void maxNumber()
    {
        //두 개의 정수를 입력받아, 두 수중 큰 값 출력하기
        int num1, num2;
        int max;
        System.out.print("비교할 수를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("비교할 수를 입력하세요: ");
        num2 = sc.nextInt();

        max = Math.max(num1, num2);
        System.out.println("두 수 중 큰 값은 " + max + "입니다.");
    }

    public void minNumber() {
        //두 개의 정수를 입력받아, 두 수중 작은 값 출력하기
        int num1, num2;
        int min;
        System.out.print("비교할 수를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("비교할 수를 입력하세요: ");
        num2 = sc.nextInt();

        min = Math.min(num1, num2);
        System.out.println(min);
        System.out.println("두 수 중 작은 값은 " + min + "입니다.");
    }

    public void threeMaxMin() {
        //세 개의 정수를 입력받아, 세 수중 가장 큰 수와 가장 작은 수 출력하기
        int num1, num2, num3;
        int min, max, temp;
        System.out.print("비교할 수를 입력하세요: ");
        num1 = sc.nextInt();
        System.out.print("비교할 수를 입력하세요: ");
        num2 = sc.nextInt();
        System.out.print("비교할 수를 입력하세요: ");
        num3 = sc.nextInt();

        temp = Math.min(num1, num2); //num1과 num2
        min = Math.min(temp, num3); //temp(num1과 num2중 더 작은 값)와 num3 비교

        temp = Math.max(num1, num2);
        max = Math.max(temp, num3);
        System.out.println("세 수 중 가장 큰 수는 " + max +"가장 작은 수는 " + min + "입니다.");
    }

    public void checkEven() {
        //한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기
        System.out.print("정수를 입력하세요.");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("짝수다.");
        } else{
            System.out.println("홀수다.");
        }
    }

    public void isPassFail() {
        //국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기
        int Korean;
        int English;
        int Math;
        double avg = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        Korean = sc.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        English = sc.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        Math = sc.nextInt();

        avg = (Korean + English + Math)/3;

        if(avg < 60){
            System.out.println("평균 점수 미달로 불합격입니다.");
        }
        if (Korean < 40){
            System.out.println("국어 점수 미달로 불합격입니다.");
        }
        if (English < 40){
            System.out.println("영어 점수 미달로 불합격입니다.");
        }
        if (Math < 40) {
            System.out.println("수학 점수 미달로 불합격입니다.");
        }

    }

    public void scoreGrade() {
        //점수를 입력받아, 학점 확인하기
        System.out.print("점수를 입력하세요.");
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("학점: A");
        } else if (score >= 80) {
            System.out.println("학점: B");
        } else if (score >= 70){
            System.out.println("학점: C");
        } else if (score >= 60) {
            System.out.println("학점: D");
        } else{
            System.out.println("학점: F");
        }
    }

    public void checkPlusMinusZero() {
        //한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기
        System.out.print("정수를 입력하세요");
        int num1 = sc.nextInt();
        if(num1>0){
            System.out.println("양수이다.");
        } else if (num1<0) {
            System.out.println("음수이다.");
        } else {
            System.out.println("0이다.");
        }
    }

    public void whatCharacter() {
        //문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기
        char ch = sc.nextLine().charAt(0);
        //영어대문자 65-90
        //영어소문자 97-122
        //아라비아 숫자(0-9) 58-64
        int intCh = (int)ch;
        if(intCh >= 58 && intCh <= 64){
            System.out.println("입력한 문자는 숫자 문자입니다.");
        } else if (intCh >= 65 && intCh <= 90) {
            System.out.println("입력한 문자는 영어 소문자입니다.");
        } else if (intCh >= 97 && intCh <= 122) {
            System.out.println("입력한 문자는 영어 대문자입니다.");
        } else{
            System.out.println("입력한 문자는 기타 문자입니다.");
        }
    }
}
