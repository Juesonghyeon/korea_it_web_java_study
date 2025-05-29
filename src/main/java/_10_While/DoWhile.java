package _10_While;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 - do while
        // 일단 한번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 1번은 실행
        //do
        //  반복될 코드
        //  } while (조건);
        int Max = 0;
        int num1 = 101;
        do {
            Max += num1;
            num1++;
        } while (num1 <= 100);
        System.out.println("합계는" + Max);
        // 1~5까지 출력
        int i = 1;
        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


    }
}