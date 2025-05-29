package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        //  for ( 선언 ; 조건; 증강;){
        //      반복될 코드
        //  }
        //  for (i=n; i=m.length(); i++){
        //      반복될 코드
        //  }
        for(int i = 0; i < 10; i++){
            System.out.println("안녕" + i);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("ㅎㅇ");
        }
        for (int i = 1; i < 11; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        for (int i = 2; i <= 11; i+=2){
                System.out.println(i);
        }
        // 10 ~ 1까지 거꾸로 출력
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        // 문제 => 1~100까지 다 더한 값을 출력하세요
        int Max = 0;
        for (int i = 0; i <= 100; i++) {
            Max = i + Max;

        }
        System.out.println(Max);
    }
}
