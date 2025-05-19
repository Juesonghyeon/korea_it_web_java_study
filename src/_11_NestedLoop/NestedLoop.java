package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //별 삼각형 찍기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - i; j++ ) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        SSSS* i = 0, j 4번 j < 4
        SSS** i = 1, j 3번 j < 3
        SS*** i = 2, j 2번 j < 2
        S**** i = 3, j 1번 j < 1
        ***** i = 4, j 0번 j < 0
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++){
                System.out.print("S");
            }
            for (int k = 0; k < i +1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
