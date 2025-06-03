package _32_Collections.strSet;

import java.util.*;

//문제
//1. "Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"
//리스트 만들어서 추가
//2. set하나 만들어서 리스트에 있던 요소들을 넣고 중복 제거하기 => 제거한 후 set출력
//3. 정렬을 위해서 다시 List하나 만들고  set에 있던 요소들을 list에 넣기
//4. 요소들을 넣은 리스트를 정렬하고 정렬된 언어 목록 출력하기
//5. searchLang변수에 "Java" 대입하고 해당 변수를 이용해서 1번 리스트에서 몇개 있는지 출력 (검색)
//6. 중복 제거를 위해 만들었던 set을 이용해서 중복제거된 후의 언어 갯수 출력하기
public class LanguageSetstver {
    public static void main(String[] args) {
        Set<String> strSet1 = new HashSet<>();
        List<String> strList1 = new ArrayList<>(Arrays.asList("Java", "Python", "C", "Python", "Java", "Java", "C++", "C", "Java"));

        for(String n : strList1){
            strSet1.add(n);
        }
        System.out.println(strSet1);
        List<String> strList2 = new ArrayList<>();
        for (String m : strSet1){
            strList2.add(m);
        }
        Collections.sort(strList2);
        for (String k : strList2){
            System.out.println(k);
        }
        String searchLang = "Java";

        int count1 = Collections.frequency(strList1, searchLang);
        System.out.println(searchLang + "는(은) " + count1 + "개 있습니다.");

        System.out.println("중복 제거된 갯수 : " + strSet1.size());
    }
}
