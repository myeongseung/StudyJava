package j09_클래스;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(5);
        Constructor c3 = new Constructor("김준일");
        Constructor c4 = new Constructor(5,"김준일");

        c1.constructorInfo();
        c2.constructorInfo();
        c3.constructorInfo();
        c4.constructorInfo();
    }
}
