package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId, username, age, email => private
        //기본생성자 하나 만들기
        //getter / setter
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("이동윤");
        userEntity.setAge(27);
        userEntity.setEmail("dongyoon7212@naver.com");

        System.out.println(userEntity);
        userEntity.setUserId(2);
        userEntity.setUsername("홍길동");
        userEntity.setAge(18);
        userEntity.setEmail("뭐라뭐라 ~ .email");
        System.out.println(userEntity.toString());
    }
}
