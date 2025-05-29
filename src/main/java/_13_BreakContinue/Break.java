package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        // 톤쇼우 웨이팅 50명
        // 판매 가능한 갯수 10개

        int waiting = 50;
        int max = 10;

        // for문: 전체 손님 리스트 출력 (1~50)
        for (int i = 1; i <= waiting; i++) {
            System.out.println(i + "번 손님 입장");
            if(i == max){
                System.out.println("재료 소진!");
                break;
            }
        }
        System.out.println("영업 종료");

        System.out.println("영업 시작");

        // while문: 실제 입장 가능한 손님 처리 (재고 10개까지)
        int nowNum = 1;
        while (nowNum <= waiting) {
            System.out.println(nowNum + "번 손님 입장");

            if (nowNum == max) {
                System.out.println("재료 소진!");
                break;
            }

            nowNum++;
        }

        System.out.println("영업 종료");
    }
}