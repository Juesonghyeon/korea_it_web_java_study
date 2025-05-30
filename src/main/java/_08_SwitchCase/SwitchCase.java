package _08_SwitchCase;
import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
        Random random = new Random();
        //조건문 - Switch Case
        //1등 => 전액 장학금
        //2등 => 반액 장학금
        //3등 => 반액 장학금
        //그 이하 => 박수

//        int ranking = 2;
//        if(ranking == 1){
//            System.out.println("전액 장학금!!");
//        }else if (ranking == 2){
//            System.out.println("반액 장학금!!");
//        }else if (ranking == 3){
//            System.out.println("소정의 상품!!");
//        }else{
//            System.out.println("짝짝짝짝!!");
//        }
//        System.out.println("수여 끝~");

//        switch (ranking){
//            case 1:
//                System.out.println("전액 장학금!!");
//                break;
//            case 2:
//            case 3:
//                System.out.println("반액 장학금!!");
//                break;
//            default:
//                System.out.println("짝짝짝짝!!!");
//        }
//        System.out.println("수여 끝~");

        int price = 7000;
        int grade = random.nextInt(4) + 1;
        // 1등급이면 10000원 등급이 한단계씩 낮아질수록 -1000

        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
        }
        System.out.println("가격은" + price);

        // 봄 : 3, 4, 5 => 봄입니다.
        // 여름 : 6, 7, 8 => 여름입니다.
        //가을 : 9, 10, 11 => 가을입니다.
        // 겨울 : 12, 1, 2 => 겨울입니다.
        int month = random.nextInt(12) + 1;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을입니다.");
                break;
        }
        if(month == 12 || month <= 2){
            System.out.println("겨울입니다.");
        }else if(month >=3 && month <=5){
            System.out.println("봄입니다.");
        }else if(month >=6 && month <=8){
            System.out.println("여름입니다.");
        }else if(month >=9 && month <=11){
            System.out.println("가을입니다.");
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }

        //1~7까지 숫자 하나 변수
        //월화수목금
        int days = random.nextInt(7) + 1;
        switch (days){
            case 1:
                System.out.println("월요일입니다.");
                break;
            case 2:
                System.out.println("화요일입니다.");
                break;
            case 3:
                System.out.println("수요일입니다.");
                break;
            case 4:
                System.out.println("목요일입니다.");
                break;
            case 5:
                System.out.println("금요일입니다.");
                break;
            case 6:
                System.out.println("토요일입니다.");
                break;
            case 7:
                System.out.println("일요일입니다.");
                break;
        }
    }
}
