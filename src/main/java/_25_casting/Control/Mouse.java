package _25_casting.Control;

public class Mouse implements Power{

    @Override
    public void off() {
        System.out.println("마우스의 전원을끕니다.");
    }

    @Override
    public void on() {
        System.out.println("마우스의 전원을켭니다.");
    }

    public void Crick(){
        System.out.println("클릭을 합니다.");
    }
}
