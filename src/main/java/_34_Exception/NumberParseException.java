package _34_Exception;

import java.util.Scanner;

/*
1. 사용자로부터 문자열 형태의 입력을 받습니다.
2. 입력된 문자열을 Integer.parseInt()를 사용하여 정수로 변환합니다.
3. 변환된 숫자를 출력합니다.
4. 만약 변환하는 과정에서 입력값이 숫자가 아니라면 예외발생 -> 예외처리 후 "숫자가 아닌 값을 입력하셨습니다"
5. 마지막엔 "프로그램 정상 종료"
 */
public class NumberParseException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 카페라떼 2. 아메리카노 3.모카라떼");
        System.out.println("어느 메뉴를 드시겠습니까?");
        try {
            int answer = Integer.parseInt(scanner.nextLine());
            System.out.println(answer + "번째 메뉴를 선택하셨습니다.");
        }catch (NumberFormatException e){
            System.out.println("메뉴의 번호를 입력하지 않으셨습니다.");
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
