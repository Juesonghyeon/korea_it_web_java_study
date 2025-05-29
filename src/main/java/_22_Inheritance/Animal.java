package _22_Inheritance;

public class Animal {
    //필드(매개변수) == 객체의 속성
    private String animalName;
    private int animalAge;

    // 생성자

    public Animal() {
        System.out.println("아무것도 가지지 못한 동물이 태어났습니다.");
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }
    public Animal(int animalAge){
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    public void move(){
        System.out.println("움직입니다.");
    }

    public void getAnimalName(String 김철수) {
    }
}
