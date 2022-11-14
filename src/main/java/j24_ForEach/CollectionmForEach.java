package j24_ForEach;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class CollectionmForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("김준일");
        list.add("김경민");
        list.add("김완준");
        list.add("이동빈");
        list.add("이종준");

//        for(String name : list){
//            System.out.println(name);
//        }
//
        list.forEach(name->{
            System.out.println(name);
        });
//
//        Consumer<String> c = new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        };
//        c.accept("개삐삐");
//
//        for(String name : list){
//            c.accept(name);
//        }
//        System.out.println(c);
//
//        Consumer<String> consumer = name ->{
//            System.out.println(name);
//        };
//
//        consumer.accept("ㅇㅇㅇ");
//        for(String name2 : list){
//            consumer.accept(name2);
//        }
//
//        for(String name : Objects.requireNonNull(list)){
//            consumer.accept(name);
//        }
//
//        Set<Integer> numbers = new HashSet<Integer>();
//        for(int i=0;i<100;i++){
//            numbers.add(i+1);
//        }
//        AtomicInteger result = new AtomicInteger();
//
//        numbers.forEach(num -> {
//            result.addAndGet(num);
//        });
//
//        System.out.println(result.get());

        Map<Integer, String> students = new TreeMap<Integer,String>();
        for(int i=0;i<10;i++){
            students.put(20220001 + i,"김준" +(i+1));
        }
        students.forEach((key,value)->{
            System.out.println("학번 : " + key + " 이름 : "+value);
        });//map에서 key 와 value를 동시에 출력하려면 entry set으로 바꿔줘야하는데
        //forEach를 이용해주면 forEach내장으로 entryset을 통해 한번에 key와 value를 출력이 가능하다.
    }

}
