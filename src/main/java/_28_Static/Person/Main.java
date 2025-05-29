package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        Person person2 = new Person("김춘향");
        Person person3 = new Person("허생");

        person1.sayHello(); // 인스턴스 메소드
        person2.sayHello();
        person3.sayHello();


        Person.showPopulation();
        System.out.println(Person.population); //클래스 메소드(static)
    }
}
