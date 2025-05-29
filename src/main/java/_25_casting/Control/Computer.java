package _25_casting.Control;

public class Computer implements Power{

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을끕니다.");
    }

    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    public void Undertale(){
        System.out.println("와 샌즈!");
    }

}
