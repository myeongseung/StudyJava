package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        //형식이 제네릭
        printCollection(list);

        list.add("문자열1");
        list.add("문자열2");
        list.add("문자열3");
        list.add("문자열4");
        list.add(1,"문자열5");

        ArrayList<String> addAlllist = new ArrayList<String>();

        addAlllist.addAll(list);
        addAlllist.addAll(2,list);
        printCollection(list);
        printCollection(addAlllist);

        //값 조회
//        String str1 = list.get(0);
//        System.out.println("str1 : " + str1);
        // 반복을 사용한 값 조회
        for(int i=0;i<list.size();i++){
            System.out.println("일반 for - str : " + list.get(i));
        }
        for(String str : list){ //str 이라는 변수안에 list 를 전부 반복
            System.out.println("일반 forEach - str : " + str);
        }
        Iterator<String> iterator = list.iterator();
        System.out.println("iterator 첫 생성시 : " + iterator.next());
        while(iterator.hasNext()){ //다음이 있냐?
            System.out.println("iterator - str : " + iterator.next());
        }
        //System.out.println("전부 생성 후"+iterator.next());
        //없어서 오류남

        //값 수정
        list.set(1,"문자열6");
        printCollection(list); //[문자열1, 문자열6, 문자열2, 문자열3, 문자열4]

        list.remove(0); //ArrayList 가 동적배열이라 자동위치조정
        printCollection(list);

        for(int i=0;i<list.size();i++) {
            if(list.get(i).equals("문자열3")){
                list.remove(i); //하나만 지우는거임
                //예를들어 list[3] list[4]가 "문자열3"이라면
                //list[3]에 있는 "문자열3"을 지우고
                //list[4]에 있는 값이 list[3]으로 이동함.
                //그래서 break 를 걸어서 하나씩만 지우도록 해야함.
                printCollection(list);
                break;
            }
        }
        list.add("문자열2");
        printCollection(list);

        //값의 위치 찾기
        //현재 list : [문자열6, 문자열2, 문자열4]
        int index = list.indexOf("문자열2");
        System.out.println("문자열 2의 위치 : " + index);
        // 없으면 -1의 값이 나옴
        // 앞에서부터 0, 1, 2
        int lastIndex = list.lastIndexOf("문자열2");
        System.out.println("뒤에서 부터 찾은 문자열2의 위치 : " + lastIndex);
        //[문자열6, 문자열2, 문자열4, 문자열2]

        //값을 포함하고 있는지 여부 조회
        boolean isTrue = list.contains("문자열2");
        System.out.println("List에 문자열2가 포함되어 있는가? " + isTrue);
        boolean isTrue1 = list.contains("문자열5");
        System.out.println("List에 문자열2가 포함되어 있는가? " + isTrue1);

        //리스트를 배열로 전환
        Object[] objects = list.toArray();
        //toArray가 Object라 Object배열로 받아야함.
        System.out.println(objects[0]);

        for(Object object : objects){
            System.out.println(object);
        }



    }
    public static void printCollection(Collection collection){
        System.out.println(collection);
        System.out.println();
    }
}
