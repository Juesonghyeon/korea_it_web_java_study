package _16_MultiArrayLoop;

public class MutiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        //seats[0] => {"A1", "A2", "A3", "A4", "A5"}
        //seats[0].length => 5
        //seats[1] => {"B1", "B2", "B3", "B4", "B5"}
        //seats[1].length => 5
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        String[][] imaxSeats = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//        for (int i = 0; i < imaxSeats.length; i++) {
//            for (int j = 0; j < imaxSeats[i].length; j++) {
//                imaxSeats[i][j] = eng[i] + (j + 1);
//
//            }
//        }
//
//        for (int i = 0; i < imaxSeats.length; i++) {
//            for (int j = 0; j < imaxSeats[i].length; j++) {
//                System.out.print(imaxSeats[i][j] + " ");
//            }
//            System.out.println();
//        }
//        String[][]arr = [][];
//
//
//
        int[][] arr = new int[3][3];
        int num = 1;

        //홀수만 다 대입
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num += 2;
            }
        }

        // 출력 확인
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("합계는 " + sum);

    }
}