package j16_Bean;

public class Person {
    private final String name; //상수로 선언하면 필수로 초기화 해야함
    private int age; //상수

    //public Person() {} NoArgsConstructor 는 생성할 수 없다.


    public Person(String name) {//이 생성자를 필수 생성자라고 한다. 상수는 초기화를 해줘야하니까.
        //RequiredArgsConstructor
        this.name = name;
    }

    public Person(String name, int age) { //AllArgsConstructor 모든 멤버변수를 가지는 생성자
        this.name = name;
        this.age = age;
    }
}
