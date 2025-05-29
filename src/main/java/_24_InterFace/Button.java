package _24_InterFace;
/*
extends => 단일 상속 (클래스, 추상클래스)
implements => 다중 상속(인터페이스)
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {
    }

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {

    }
}
