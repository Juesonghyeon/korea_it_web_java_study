package _25_casting.Animal;

public class Parrot extends Animal{
    @Override
    public void speak() {
        super.speak();
        System.out.println("당신을 따라 말합니다.");
    }

    public void fly(){
        System.out.println("날아다닙니다.");
    }

}
