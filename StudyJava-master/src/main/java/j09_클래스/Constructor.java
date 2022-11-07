package j09_클래스;

public class Constructor {
    int num;
    String name;

    Constructor(){ //기본생성자
        System.out.println("NoArgsConstructor(기본생성자)");
    }
    Constructor(int num){ //우선순위가 지역이 높음
        this.num = num;
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
    }
    Constructor(String name){
        this.name = name;
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
    }
    Constructor(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("AllArgsConstructor(전체 생성자)");
    }

    void constructorInfo(){
        System.out.println("num : " + num);
        System.out.println("name : " + name);
    }
}
