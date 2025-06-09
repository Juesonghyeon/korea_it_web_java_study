package test;
import java.util.Scanner;
import java.util.Random;

public class 수학문제 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int correctCount = 0;
        int i = 0;
        String[] operators = {"*", "/", "+", "-"};

        System.out.print("몇 문제를 푸시겠습니까? : ");
        int totalQuestions = scanner.nextInt();

        while (totalQuestions > i){
            int x = random.nextInt(10 );
            int y = random.nextInt(1, 10);  // y는 1~99로 하여 0 방지
            int operatorIndex = random.nextInt(4);
            String operator = operators[operatorIndex];
            int answer = 0;

            switch (operator) {
                case "*":
                    answer = x * y;
                    break;
                case "/":
                    answer = x / y;
                    break;
                case "+":
                    answer = x + y;
                    break;
                case "-":
                    answer = x - y;
                    break;
                default:
                    System.out.println("오류 발생");
                    continue;
            }

            System.out.println(x + " " + operator + " " + y + " = ?");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("정답입니다.");
                correctCount++;
            } else {
                System.out.println("오답입니다. 정답은 " + answer + " 입니다.");

            }
            i++;
        }

        System.out.println("총 맞춘 갯수는 : " + correctCount);
    }
}