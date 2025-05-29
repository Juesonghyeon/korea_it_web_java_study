package _25_casting.Control;

public class LEDLight implements Power{
    @Override
    public void off() {
        System.out.println("LED의 전원을끕니다.");
    }

    @Override
    public void on() {
        System.out.println("LEd의 전원을 켭니다.");
    }

    public void colorChance(){
        System.out.println("색상을 바꿉니다.");
    }
}
