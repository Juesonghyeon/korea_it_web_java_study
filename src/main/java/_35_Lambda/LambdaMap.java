package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//1. 스캐너 객체 선언, 입력받아서 저장할 Map선언(String, Integer)
//2. 상품을 입력할 갯수를 count로 입력받기 (nextInt)
//3. count만을 반복해서 상품명(키)과 가격(값)으로 입력받고 map에 추가
public class LambdaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        System.out.print("몇 개의 상품을 입력하시겠습니까?: ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= count; i++) {
            System.out.print("상품명을 입력하세요: ");
            String answer1 = scanner.nextLine();
            System.out.print("상품의 가격을 입력하세요: ");
            int answer2 = Integer.parseInt(scanner.nextLine());
            productMap.put(answer1, answer2);
        }
        System.out.println("[상품 목록]");
        productMap.forEach((answer1,answer2) -> System.out.println("상품명: " + answer1 + "\n가격: " + answer2));
    }
}
