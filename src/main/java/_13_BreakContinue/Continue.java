package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 - continue
        // continue - 다시 처음으로 돌아감
//        for (int i = 1; i <= waiting ; i++) {
//            System.out.println(i + "번 손님 입장!");
//
//            sold++;
//            if(sold == max){
//                System.out.println("재료 소진!");
//                break;
//            }
//            else if (i == noShow) {
//                System.out.println(i + "번 손님 노쇼 ;;");
//                max++;
//                continue;
//            }
//        }
//        System.out.println("영업 종료");

        int waiting = 50; // 대기 인원수
        int max = 20; // 판매 가능한 갯수
        int sold = 0; // 현재 판매량
        int noShow = 12; // 노쇼 번호
        int nowNum = 1;
        while (nowNum <= waiting){
            sold++; // 판매 처리
            if(sold == max) {    // 메뉴가 다 팔렸을때
                System.out.println("재료 소진!");
                break;
            }

            if(nowNum == noShow){
                System.out.println(nowNum + "번 손님 노쇼 ;;");
                nowNum++;
                max++;
                continue;
            }
            nowNum++;
            System.out.println(nowNum + "번 손님 입장!");
            System.out.println(sold + "개 판매!");
        }
        System.out.println("영업 종료");
    }
}
