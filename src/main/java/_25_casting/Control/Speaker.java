package _25_casting.Control;

public class Speaker implements Power{

    @Override
    public void off() {
        System.out.println("스피커의 전원을끕니다.");
    }

    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    public void controlVolume(){
        System.out.println("스피커의 볼륨을 조절합니다.");
    }
}
