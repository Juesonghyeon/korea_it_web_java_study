package _34_Exception;

import java.util.Scanner;

//1. 사용자로부터 두 개의 정수를 입력받습니다.
//2. 첫 번째 수를 두 번째 수로 나눈 결과를 출력합니다.
//3. 두 번째 수가 0이면 예외가 발생하므로, "0으로 나눌 수 없습니다."라는 메시지를 출력해야 합니다.
//4. 마지막엔 프로그램 종료
public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //케이스.1
//        try {
//            System.out.println("나누어질 수를 입력해주세요 : ");
//            int num1 = Integer.parseInt(scanner.nextLine());
//            System.out.println("나눌 수를 입력해주세요 : ");
//            int num2 = Integer.parseInt(scanner.nextLine());
//            int result1 = num1 / num2;
//            System.out.println("결과 : " + result1);
//        } catch (ArithmeticException e){
//            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
//        } catch (NumberFormatException e){
//            System.out.println("문자열을 적으셨습니다." + e.getMessage());
//        }finally {
//            System.out.println("프로그램 정상 종료");
//        }
        //케이스.2

        System.out.println("첫 번째 수 : ");
        int a = scanner.nextInt();
        System.out.println("두 번째 수 : ");
        int b = scanner.nextInt();

        try {
            int result1 = a / b;
            System.out.println("결과 : " + result1);
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage());
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
