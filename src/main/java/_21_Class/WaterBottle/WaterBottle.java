package _21_Class.WaterBottle;

public class WaterBottle {
    //문제
    //WaterBottle => WaterBottle클래스, WaterBottleMain
    //currentWater : 현재 물의 양
    //메소드
    //물 채우기(fill) => 최대용량인 1000을 넘을 수 없다.
    //물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
    //getter를 통해 현재 물병의 물의 양에 접근할 수 있다.
    private int currenwater = 0;

    public WaterBottle(){
        System.out.println("빈 물병이 만들어졌습니다.");
    }

    public void fill(int amount){
        if(amount >= 0 && currenwater + amount <= 1000){
             currenwater += amount;
                System.out.println(amount + "의 양만큼 물을 채웠습니다 현재 물의 양은 : " + currenwater);
        }
        else {
            System.out.println("0이하의 물을 채우거나 물병을 초과하여 마실 수 없습니다. 현재 물의 양 : " + currenwater);
        }
    }
    public void drink(int amount){
        if(currenwater - amount >= 0 && amount <= 1000){
            currenwater -= amount;
                System.out.println(amount + "의 양만큼 물을 마셨습니다. 현재 물의 양은 : " + currenwater);
        }
        else {
            System.out.println("0이하의 물을 마시거나 물병을 초과하여 마실 수 없습니다. 현재 물의 양 : " + currenwater);
        }
    }
    public int getCurrenwater(){
        return currenwater;
    }

}
