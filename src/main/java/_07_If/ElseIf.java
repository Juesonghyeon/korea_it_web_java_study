package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        //다중 조건문
        int avgScore = -1;

        //90이상이면 "A"
        //80이상이면 "B"
        //70이상이면 "C"
        //60이상이면 "D"


        if(avgScore >= 90){
            System.out.println("등급A");
        } else if (avgScore >= 80) {
            System.out.println("등급B");
        } else if (avgScore >= 70) {
            System.out.println("등급C");
        } else if (avgScore < 70 && avgScore > 0) {
            System.out.println("등급D");
        } else {
            System.out.println("잘못 입력하였습니다.");
        }
        // 앞에 참이 나온 조건이 있으면 뒤에는 다 무시

        //중첩 if
        int age = 18;
        String gender = "남성";
        if (age >= 20){
            if(gender.equals("남성")){
                System.out.println("성인 남성입니다.");
            }
            else {
                System.out.println("성인 여성입니다.");
            }
        }
        else {
            if(gender.equals("남성")){
                System.out.println("미성년자 남성입니다.");
            }
            else {
                System.out.println("미성년자 여성입니다.");
            }
        }
    }


}
