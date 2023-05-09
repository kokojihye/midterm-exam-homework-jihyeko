package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {

    public void calculator() {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int result;
        String operator;

        System.out.print("정수를 입력하세요 : ");
        num1 = sc.nextInt();

        System.out.print("정수를 입력하세요 : ");
        num2 = sc.nextInt();

        System.out.print("연산자를 입력하세요(+, -, *, /, %) : ");
        operator = sc.next();

        switch (operator) {
            case ("+"):
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case ("-"):
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case ("*"):
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            case ("/"):
                result = num1 / num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                break;
        }
    }

    public void fruitPrice () {
        int price;
        Scanner sc = new Scanner(System.in);
        System.out.println("상품: 사과, 바나나, 복숭아, 키위");
        System.out.print("과일 이름을 입력하세요: ");
        String fruit = sc.nextLine();

        switch (fruit) {
            case ("사과"):
                price = 1000;
                System.out.println(fruit + "의 가격은 " + price + "입니다.");
                break;
            case ("바나나"):
                price = 3000;
                System.out.println(fruit + "의 가격은 " + price + "입니다.");
                break;
            case ("복숭아"):
                price = 2000;
                System.out.println(fruit + "의 가격은 " + price + "입니다.");
                break;
            case ("키위"):
                price = 5000;
                System.out.println(fruit + "의 가격은 " + price + "입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                break;
        }
    }

}

