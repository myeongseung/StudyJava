package j12_상속;

public class Main {
    public static void main(String[] args) {
 //       Animal animal = new Animal(); //Animal생성
        Human human = new Human("김준일"); //Animal, Human생성
        Tiger tiger = new Tiger("호냥나비"); //Animal생성

   //     animal.move();
        human.move();
        tiger.move();

        System.out.println("사람의 이름 : " + human.getName());
        System.out.println("호랑이 이름 : " + tiger.getName());

    }
}
