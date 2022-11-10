package j19_컬렉션;

import java.util.*;

public class StringMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();

        list.add("김준일");
        list.add("이동빈");
        list.add("도정민");
        list.add("최해혁");
        list.add("김준일");

        System.out.println(list);
        System.out.println(list.get(3));

        map.put("kor2022000-j","김준일");
        map.put("kor2022000-l","이동빈");
        map.put("kor2022000-d","도정민");
        map.put("kor2022000-c","최해혁");
        map.put("kor2022000-j2","김준일");

        System.out.println(map);
        System.out.println(map.get("kor2022000-j"));

        /*
            kor2022000-c 학번의 학생의 이름을 김완준으로 바꿔라
        */

        //값 수정(이미 존재하는 값을 덮어 씌우기)
        String searchId = "kor2022000-c";
        map.put(searchId,"김완준");
        System.out.println(map.get(searchId));

        //값 수정(이미 존재하는 값을 수정)
        map.replace(searchId,"이성욱");
        System.out.println(map);

        //값 삭제
        map.remove(searchId);
        System.out.println(map);

        boolean isTrue = map.containsKey("kor2022000-j2");
        System.out.println(isTrue); //true

        //containsValue
        boolean searchSuccessflag = map.containsValue("김준일");
        System.out.println(searchSuccessflag);//true

        //entrySet 키랑 벨류를 반복해서 돌릴때 사용
        Set<Map.Entry<String, String>> entry = map.entrySet();
        List<Map.Entry<String, String>> entries = new ArrayList<Map.Entry<String, String>>();
        entries.addAll(entry);
        System.out.println("entry리스트: "+ entries);
        entry.iterator().forEachRemaining(e -> {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });


        Iterator<Map.Entry<String, String>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> e = iterator.next();
            System.out.println(e.getKey());
        }

        Set<String> keySet = map.keySet();
        System.out.println("keySet>>>>> " + keySet);

        Collection<String> values = map.values();
        System.out.println("values>>>>> " + values);


        //getOrDefault(Object key, String defaultValue)
        //해당 키가 없을때 뒤의 벨류를 무조건 리턴해라 기본 value 의 타입과 동일

        //keySet
        //key 값들만 전부빼서 Set 으로 변환

        //merge 디비랑 같음 통합

        //putAll map 을 map 속에 넣을때 자료형이 서로 동일하면 가능

        //values Collection<String> list 로 리턴 해준다.
    }
}
