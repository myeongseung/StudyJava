package J14_인터페이스;
/*
*
* Interface(인터페이스)
* 1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
* 2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용해야 한다.
* 3. 생성자 정의는 불가능하다.
* 4. 변수선언도 불가능하다.
* 5. 상수선언은 가능하다.
* */

//interface는
//abstract 키워드가 생략됨
public interface Press {
    public static final String NAME = "press";
    public void onPressed();

//    private String name;
//    public Button(){
//
//    }
//    public default void pop(){
//
//    }
}
