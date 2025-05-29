package _25_casting.Control;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    public void addDevice(Power device) { // => 암시적으로 업캐스팅

        int emptyIndex = checkEmpty();
        if(emptyIndex == -1){
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");
        //device만 찍으면 페키지 주소, 메모리 주소, 클래스 명까지 나옴
        //getClass까지 찍으면 페키지 주소, 클래스 명까지 나오니까
        //getSimpleName까지 찍어야 클래스 명까지 나옴

    }
    public int checkEmpty(){
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null){
                return i; //빈자리 찾았을때
            }
        }
        return -1; //다 차있을때
    }

    public void powerOn(){
        for(Power device : deviceArray){
            if(device == null){
                System.out.println("장치가 등록 되어있지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }
    
    public void powerOff(){
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null){
                System.out.println("장치가 등록 되어있지 않은 슬롯입니다.");
                continue;
            }else {
                deviceArray[i].off();
            }
            
        }
    }
    public void performSpecificMethod(){
        for(Power device : deviceArray){
            if(device instanceof Computer){
                Computer computer = (Computer) device;
                computer.Undertale();
            }else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.Crick();
            } else if (device instanceof  Tv) {
                Tv tv = (Tv) device;
                tv.changeChannel();
            } else if (device instanceof  LEDLight) {
                LEDLight ledLight = (LEDLight) device;
                ledLight.colorChance();
            }else if(device instanceof  SmartPhone){
                SmartPhone smartPhone = (SmartPhone) device;
                smartPhone.sendKokaoTalk();
            }else if(device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.controlVolume();
            }

        }
    }
}
