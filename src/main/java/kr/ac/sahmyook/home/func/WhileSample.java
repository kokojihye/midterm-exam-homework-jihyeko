package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
    Scanner sc = new Scanner(System.in);
    public void printUniCode(){
        //문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)
    }
    public void sum1To100(){
        //1~100까지 정수들의 합계 출력하기(while 문으로 작성)
        int num=1;
        int sum = 0;

        while(num <= 100){
            sum += num;
            num++;
        }
        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }
    public void numberGame(){
        //1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        System.out.println("1부터 100사이의 랜덤 숫자를 알아맞추세요.");
        while(true){
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt();

            if(randomNum > num){
                System.out.println("입력한 숫자보다 랜덤값이 큽니다.");
            } else if (randomNum < num) {
                System.out.println("입력한 숫자보다 랜덤값이 작습니다.");
            } else {
                System.out.println("정답입니다.");
                return;
            }
        }

    }
    public void countCharacter(){
        //문자열을 입력받아, 글자 갯수 알아내어 출력하기
        String str = sc.nextLine();

    }
    public void countInChar(){
        //문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기
    }
}
