package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        //배열 순회
        String[] countries = {"Hungary","Croatia","Slovenia","Austria","Czech"};
        //반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }
//        for (int i = 0; i< countries.length; i++){
//            System.out.println(countries[i]);
//        }

        // 향상된 for문 (enhanced for (for-each))
        for (String country : countries){
            //(문자열 받을 변수 : 자동 반복될 변수)
            System.out.println(country);
        }
    }
}
