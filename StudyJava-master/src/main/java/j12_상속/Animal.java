package j12_상속;

public class Animal {
    private String name;

//    public Animal(){
//        System.out.println("Animal 생성");
//    }
    public Animal(String name){
        System.out.println("Animal 생성");
        this.name = name;
    }
    public void move(){ //메소드 상속
        System.out.println("움직입니다.");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
