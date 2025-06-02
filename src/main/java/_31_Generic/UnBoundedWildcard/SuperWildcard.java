package _31_Generic.UnBoundedWildcard;

import java.util.Objects;


public class SuperWildcard {
    //하한 경계 와일드카드 : Dog 또는 Dog의 상위 타입만 허용
    public static void putDog(Box<? super Dog> box){ // super는 쓰기는 가능, 읽기는 안됨
        box.setItem(new Dog()); //쓰기는 가능, 읽기는 안됨
//        Dog dog = box.getItem(); 읽기는 안됨

        Object obj = box.getItem(); // 읽을수는 있으나 object로 반환됨

        System.out.println("obj: " + obj);
    }
}
