package _18_Overloading;

public class Overloading {
    public static int getPower(int numbers){
        return numbers * numbers;
    }
    public static int getPower(double double_number){
        int numbers = (int) double_number;
        return  numbers * numbers;
    }
    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }
    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void printInfo(String name){
        System.out.println("이름은 : " + name);
    }
    public static void printInfo(String name, int age){
        System.out.println("이름은 : " + name + " 나이는 : " + age);
    }
    public static void printInfo(String name, int age, String email){
        System.out.println("이름은 : " + name + " 나이는 : " + age +" 이메일은 : " + email);
    }
    public static void add(int num1, int num2){
        System.out.println(num1 + " * " + num2 + " = " + num1 + num2);
    }
    public static void add(double num1, double num2){
        int num3 = (int) num1;
        int num4 = (int) num2;
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }
    public static void add(String strnum1, String strnum2){
        int num1 = Integer.parseInt(strnum1);
        int num2 = Integer.parseInt(strnum2);
        System.out.println(strnum1 + " + " + strnum2 + " = " + (num1 + num2));
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 개 선언
        // 매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        // 리턴되는 자료형이 같아야함
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPowerByExp(2,4));
        printInfo("주송현");
        printInfo("주송현", 18);
        printInfo("주송현", 18, "12345679abcdefg@gmail.com");
        add(3,4);
        add(1.2, 3.4);
        add("4", "5");
    }
    //문제
    //메소드 이름 printInfo()
    //문자열 이름만 전달 => 이름을 출력
    //문자열 이름, 정수 나이 전달 => 이름 나이 출력
    //문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력

    //메소드 이름 add()
    //int와 int 덧셈
    //double과 double의 덧셈
    //문자열 숫자와 문자열 숫자의 덧셈
}
