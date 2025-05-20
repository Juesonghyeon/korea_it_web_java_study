package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %2d ", i, j, i * j);
            }
            System.out.println();
        }
        for (int i = 2; i < 9; i++) {
            for (int j=1; j<=9; j++){
                System.out.println(i + "X" + j + "=" + i*j);
            }
            System.out.println();

        }
    }
}
