package _32_Collections.strMap;

import java.util.*;

public class StrMap {
    //Map - 키(key) / 값(Value)의 쌍으로 이루어진 데이터들의 집합
    //키는 중복될 수 없다. value는 중복 가능, 순서 없음

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        //Map에 Key - Value 쌍으로 삽입 -> .put(키, 값)
        strMap1.put("kor2025001", "깜둥이");
        strMap1.put("kor2025002", "깜둥삼");
        strMap1.put("kor2025003", "깜둥사");
        strMap1.put("kor2025004", "깜둥오");
        strMap1.put("kor2025005", "깜둥육");

        //출력
        System.out.println(strMap1);

        //Map의 순회
        //Map은 직접적으로 순회할 수 없다 => 직접 for-each를 돌릴 수 없음
        //왜냐? 순회하기 위해서는 Iterable<?> 인터페이스를 구현한 클래스이거나 배열(T[])것들만 가능
        //collection은 iterable 인터페이스를 상속받음 (iterable은 반복이 가능하게 하는 인터페이스)
        //근데 Map은 collection 아님, 그래서 순회 불가
        //그럼에도 순회하고싶으면?
        System.out.println(strMap1.entrySet()); //키 값 전체를 set형태로 반환
        System.out.println(strMap1.keySet()); //키만 set형태로 반환

        //keySet()을 이용했을때
        for (String key : strMap1.keySet()){
            System.out.println("키:"+ key + " 값:" + strMap1.get(key));
        }

        //entrySet()을 이용했을때
        for (Map.Entry<String, String> entry : strMap1.entrySet()){
            System.out.println("키 : " + entry.getKey() + " 값 : " + entry.getValue());
        }
        //entrySet을 이용하게 되면 키값전체 내용이 set형태로 오는데 keySet 처럼 한가지만 String으로
        //들어가는게 아님 그래서 키값형태를 받아줄 수 있는 Map.Entry에다가 넣어야함
        //Map.Entry는 Map에 들어가는 데이터의 형식인 키값 형태인 것임

        //수정 또는 추가
        strMap1.put("kor2025005", "감둥팔");
        //이미 있는 키라면 값의 수정 발생
        //없는 키라면 추가 발생

        System.out.println(strMap1);

        //특정 key의 value조회
        System.out.println(strMap1.get("kor2025005"));
        //Map에는 인덱스가 없다 => 키로 접근해서 값을 출력 => 순서도 없다

        //특정 key의 존재 여부
        boolean isContain = strMap1.containsKey("kor2025003");
        System.out.println("kor2025003의 존재 여부 : " + isContain);

        //특정 value의 존재 여부
        boolean isContain2 = strMap1.containsValue("깜둥이");
        System.out.println("깜둥이의 존재 여부 : " + isContain2);

        //Map => Set
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2.size()); //키값을 하나의 element로 보고 있다.
        System.out.println(entrySet2);

        //Map => List
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        entryList1.addAll(entrySet2);
        //Map은 collection이 아니기 때문에 set를 거쳐서 넣는다.
        System.out.println(entryList1);

        //Map정렬 => 사실은 불가능
        //Map은 빠른 탐색 및 검색을 위해서 만들어진(설계된) 형태
        //정렬은 고려되지 않고 만들어짐 => 그래서 순서를 보장하지 않음
        //그럼에도 정렬을 하고 싶다면?
        Collections.sort(entryList1, Map.Entry.comparingByValue()); //값기준 정렬
        System.out.println("값기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey()); //키기준 정렬
        System.out.println("키기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder())); //키기준 역수 정렬
        System.out.println("키기준 역순 정렬 : " + entryList1);

        //Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
    }
}
