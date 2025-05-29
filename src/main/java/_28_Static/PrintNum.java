package _28_Static;

public class PrintNum {
    private int num = 10;

    public static void printNum(){
//        System.out.println(num);
    }
    //num은 객체가 있어야하는데, printNum()은 객체 없이 호출되므로
    //num에 접근할 수 없다.
}
