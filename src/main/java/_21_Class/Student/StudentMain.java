package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("이동윤", 27, "dongyoon7212@naver.com", "부산광역시...");
        student.setName("홍길동");
//        student.name = "이동윤";
//        student.age = 27;
//        student.email = "dongyoon7212@naver.com";
//        student.address = "부산광역시 ...";
        System.out.println(student.getEmail());
        student.showInfo();
    }
}