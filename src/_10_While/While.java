package _10_While;

public class While {
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 참일 동안 계속 반복
        //while(조건)ㅖ
        //      반복할 코드
        //}

        //for문 - 횟수 중심
        //while문 - 조건 중심
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        int j = 10;
        while(j >= 1){
            System.out.println(j);
            j--;
        }
        int k = 1;
        while (k <= 10){
            if(k % 2 == 0){
                System.out.println(k);
            }
            k++;
        }
        // 1~100까지 누적합
        int Max = 0;
        int num1 = 1;
        while (num1 <= 100){
            Max += num1;
            num1++;
        }
        System.out.println("합계는" + Max);

    }
}
