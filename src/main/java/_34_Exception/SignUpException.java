package _34_Exception;

import java.util.Scanner;

class AgeLoginFailedException extends Exception{
    public AgeLoginFailedException(String message){ //2
        super(message);
//        System.out.println("예외가 발생했습니다."); //3
    }
}



public class SignUpException {
    public static void newcustomer(String name, int age) throws AgeLoginFailedException {
        if (age < 14) {
            throw new AgeLoginFailedException("14세 미만은 가입할 수 없습니다.");//1
        }
        else {
            System.out.println(name + "님 환영합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가입자의 이름 : ");
        String name = scanner.nextLine();
        System.out.println("가입자의 나이 : ");
        int age = scanner.nextInt();
        try {
            newcustomer(name, age);
        }catch (AgeLoginFailedException e){
            System.out.println("로그인 실패 : " + e.getMessage()); //6
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
