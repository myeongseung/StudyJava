package j12_상속;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override //@가 붙은녀석을 anotation(어노테이션)이라고 한다.
    //해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기
    public void move(){ //부모클래스에 먼저 선언된 메소드를
        //자식클래스에서 한번 더 선언하여 사용하는 것을
        //메소드 오버라이딩이라고 한다.
        //다른 말로 메소드 재정의
        //상위 객체의 메소드를 하위 객체에서 다시 정의하는 행위
        System.out.println("네 발로 뜁니다.");
    }


}
