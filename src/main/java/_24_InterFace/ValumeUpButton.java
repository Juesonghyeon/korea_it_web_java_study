package _24_InterFace;

public class ValumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("볼륨을 한 칸 올립니다.");
    }

    @Override
    public void onUp() {
        System.out.println("볼륨을 계속 올립니다.");
    }
}
