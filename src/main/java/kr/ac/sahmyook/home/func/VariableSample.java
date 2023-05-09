package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        String name = "고지혜";
        int age = 24;
        char gender = '여';
        String address = "서울시 강동구 성내동";
        String phoneNumber = "010-3225-3269";

        System.out.println("내 정보");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("address = " + address);
        System.out.println("phoneNumber = " + phoneNumber);
    }
    public void empInformation(){
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.next();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("성별을 입력하세요: ");
        char gender = sc.next().charAt(0);

        System.out.print("주소를 입력하세요: ");
        String address = sc.next();

        System.out.print("전화번호를 입력하세요: ");
        String phoneNumber = sc.next();

        System.out.println("입력한 사원 정보");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("address = " + address);
        System.out.println("phoneNumber = " + phoneNumber);
    }
}
