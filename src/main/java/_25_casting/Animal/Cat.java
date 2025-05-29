package _25_casting.Animal;

public class Cat extends Animal{
    @Override
    public void speak() {
        super.speak();
        System.out.println("야옹");
    }
    public void punch(){
        System.out.println("당신을 때립니다.");
    }
}
