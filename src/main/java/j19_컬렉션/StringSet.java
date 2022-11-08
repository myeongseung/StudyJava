package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringSet {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<String>();
        List<String> strList = new ArrayList<String>();
        //보통 중복 제거용으로 Set을 많이 사용함
        strList.add("이동빈");
        strList.add("이승아");
        strList.add("우예희");
        strList.add("이종준");
        strList.add("변상원");
        strList.add("김준일");
        //값 추가
        strSet.add("김준일");
        strSet.add("장혜민");
        strSet.add("정순동");
        strSet.add("김완준");
        strSet.add("송아셀");


        System.out.println(strList);
        strSet.addAll(strList);
        System.out.println(strSet);

        //값 조회
        /*
        * strSet에 김준일이 있으면 true 없으면 false
        * */
        //내코드
        String searchName = "김준일";
        boolean isTrue = strSet.contains(searchName);
        if(isTrue){
            System.out.println(searchName + "이 있습니다.");
        }else{
            System.out.println(searchName + "이 없습니다.");
        }
        //강사님코드
        for(String name : strSet){
            if(name.equals(searchName)){
                System.out.println(true);
                break;
            }
        }
        System.out.println(!isTrue);
        searchName = "송아셀";
        //송아셀 이름이 있으면 송아셀 이름을 남강석으로 바꿔라
        //내코드
        System.out.println(strSet);
        for(String name : strSet){
            if(name.equals(searchName)){
                strSet.remove(searchName);
                strSet.add("남강석");
                break;
            }
        }

        searchName = "김준일";
        if(strSet.contains(searchName)){
            strSet.remove(searchName);
            strSet.add("김준이");
        }
        System.out.println(strSet);


    }
}
