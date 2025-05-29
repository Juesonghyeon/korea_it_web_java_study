package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.println(123);

        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;
        System.out.println("num1:" + num1);

        long l = 100_000_000_000l;
        System.out.println(l);

        //실수 = float. double
        float f = 3.142f;
        double d = 3.14159265358973;

        //문자 - char
        char a = 'a';
        char b = 'b';
        System.out.println("" + a + b);
        System.out.println();

        //문자열

        String str = "안녕하세요";
        System.out.println(str);

        //논리 자료형 = boolean

        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        /*
        *  제 이름은 ***입니다 제 나이는 ***살이고
        *  취미는 ***입니다.
        *
        * */

        String name = "주송현";
        int age = 18;
        String habit = "게임";
        String MBTI = "ENTP";
        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age + "살이고\n취미는 " + habit + "입니다.");
        System.out.println("제 MBIT는 " + MBTI + "입니다.");


    }

}
