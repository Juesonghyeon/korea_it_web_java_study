package _36_StreamApi;

//1. 스캐너 객체 생성. producet List하나 생성하면서
//"애플 아이폰 15 pro",
//"애플 맥북 프로 M3",
//"애플 아이패드 에어 5세대",
//"삼성 갤럭시 S24 울트라",
//"삼성 갤럭시 Z 플립 5",
//"삼성 캘럭시탭 S9",
//"엘지 울트라기어 게이밍 모니터" 제품을 넣기
//2. 브랜드 키워드 입력받기 => stream filter이용해서 키워드 브랜드 뽑아내고 List에 담기
//3. 뽑아온 브랜드 상품들 출력 없으면 없다고 출력

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApilExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> producet = Arrays.asList(
                "애플 아이폰 15 pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어 5세대",
                "삼성 갤럭시 S24 울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 캘럭시탭 S9",
                "엘지 울트라기어 게이밍 모니터");



        System.out.print("어떤 브랜드의 전자상품을 원하시나요? : ");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("samsung" ) || answer.equals("삼성")) {
            answer = "삼성";
        }
        else if(answer.equalsIgnoreCase("apple" ) || answer.equals("애플")) {
            answer = "애플";
        } else if (answer.equalsIgnoreCase("lg" ) || answer.equals("엘지")) {
            answer = "엘지";
        }
        String keyword = answer;

        List<String> result = producet.stream()
                .filter(product -> product.contains(keyword))
                .toList();
        System.out.println("해당 브랜드의 제품이 없습니다.");
        if(result.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        } else {
            result.forEach(System.out::println);
        }
    }
}
