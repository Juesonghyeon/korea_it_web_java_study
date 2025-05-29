package _25_casting.Control;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("TV의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("TV의 전원을끕니다.");
    }

    public void changeChannel(){
        System.out.println("TV의 전원을 돌립니다.");
    }
}
