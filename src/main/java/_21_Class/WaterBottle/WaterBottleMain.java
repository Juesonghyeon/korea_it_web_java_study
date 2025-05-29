package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.fill(500);
        waterBottle.fill(501);
        waterBottle.drink(500);
        waterBottle.fill(500);
        waterBottle.drink(501);
        System.out.println(waterBottle.getCurrenwater());
    }
}
