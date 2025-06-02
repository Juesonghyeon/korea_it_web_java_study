package _31_Generic.UnBoundedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();

        SuperWildcard.putDog(animalBox);  // Dog 위 상위 클래스인 animal이 들어가서 이건 됨
        SuperWildcard.putDog(dogBox);     // 이거까진 됨
//        SuperWildcard.putDog(malteseBox); // 이건 안됨
    }
}
