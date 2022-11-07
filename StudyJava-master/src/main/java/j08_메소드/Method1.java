package j08_메소드;

/*
 *
 * 메쏘드란? 함수이다.
 * 함수란? 일련의 동작을 묶어 정의한 것.
 * 함수의 특징? 입력과 출력을 가질 수 있다.
 * 그러면 왜 메소드라고 부르는가 ?
 *
 * 클래스 안에 함수를 정의하면 메소드라고 부른다.
 * 함수를 실행하는 것을 우리는 호출(call)라고 칭한다.
 *
 */

public class Method1 {
    //Main 메소드
    //1. [x | x]입력(매개 변수), 출력(return 반환) 입력과 출력 모두없음
    public static void  call1(){
        System.out.println("[ x | x ]");
    }//매개변수도  없고 리턴도 없음

    //2. [o | x] 매개변수o, 출력x
    public static void call2(String str)
    {
        System.out.println("[ o | x ]\n" + str);
    }//매개변수 있고 리턴 없음

    //3. [x | o] 매개변수x, 출력 o
    public static String call3()
    {
        String result = "";
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    //4. [o | o] 매개변수o, 출력o
    public static String call4(int year,int month, int day){
        return year + "년 " + month + "월 "+ day + "일";
    }
    public static void main(String[] args) {
        call1();
        call2("수업과목 : 자바");
        String str1 = call3();
        System.out.println(str1);
        String date = call4(2022,10,24);
        System.out.println(date);
    }
}
