package j12_상속;

public class Human extends Animal{
//    public void move(){
//        System.out.println("두 발로 걷습니다.");
//    }


    public Human(String name){ //생성자 Human이 생성되면 슈퍼클래스인 Animal도 같이 생성됨
        super(name); //부모의 주소를 가리킴 this는 자기자신의 주소
        //super() : 부모생성자 호출이 항상 기본적으로 생략되어있다
        //메소드 오버로딩할때 super()를 이용하여 오버로딩한 메소드를 가리키게 함
        System.out.println("Human 생성");
    }

//    public Human(String name){ //생성자 Human이 생성되면 슈퍼클래스인 Animal도 같이 생성됨
//         //부모의 주소를 가리킴 this는 자기자신의 주소
//        //super() : 부모생성자 호출이 항상 기본적으로 생략되어있다
//        //메소드 오버로딩할때 super()를 이용하여 오버로딩한 메소드를 가리키게 함
//        System.out.println("Human 생성");
//        super(name);
//    } 부모가 먼저 생성이되고 자식이 생성되어야만 가능함.

    @Override
    public void move(){
        super.move(); //슈퍼클래스의 move를 호출함.
        System.out.println("두 발로 걷습니다.");
    }
}
