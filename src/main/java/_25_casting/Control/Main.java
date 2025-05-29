package _25_casting.Control;

public class Main {
    public static void main(String[] args) {
        //Power 인터페이스
        //on(), off()
        //Tv, Computer, Speaker, LEDLight, Mouse, SmartPhone
        //제정의하고 고유메소드 1개
//        Power[] powers = {new Computer(), new Mouse(), new Tv()};
//        CentralControl centralControl = new CentralControl(powers);
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new Tv());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new SmartPhone());

        centralControl.powerOn();
        centralControl.powerOff();

        centralControl.performSpecificMethod();
    }
}
