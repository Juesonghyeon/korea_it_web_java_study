package _22_Inheritance;

public class Main {
    public static void main(String[] args) {
        //상속 - 기존 클래스(부모클래스)의 속성과 기능(메소드)을 새로운 클래스(자식 클래스)가 물려받는 것
        //왜 상속을 해야하나?
        // => 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념
        // => 유지 보수 즉 공통 기능이 한곳(부모클래스)에 있으므로, 수정할 일이 생기면 부모클래스 하나만 고치면 자식클래스에도 반영됨
        // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다(개방 폐쇄 원칙)
        // 개방 폐쇄 원칙: 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다.

        //자식클래스는 부모의 코드를 그대로 사용
        //자식클래스는 부모의 코들르 그대로 사용하거나, 필요한 가능을 또 추가하거나
        //부모의 코드(메소드) 변경 가능 => 오버라이딩
        Animal animal1 = new Animal();
        animal1.setAnimalName("춘식이");
        animal1.setAnimalAge(12);
        animal1.move();
        System.out.println("이름:" + animal1.getAnimalName() + " 나이:" + animal1.getAnimalAge());

        Tiger tiger1 = new Tiger();

        Human human1 = new Human("김철수", 54);
        System.out.println(human1.getAnimalName());
        System.out.println(human1.getAnimalAge());
        human1.move();
        human1.read("어린왕자");
    }
}
