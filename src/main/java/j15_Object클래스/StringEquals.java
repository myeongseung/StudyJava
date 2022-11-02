package j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일");
        String name4 = new String("김준일");

        System.out.println(name1 + ", " + name2+ ", " + name3);
        System.out.println(name1 == name2); //true
        System.out.println(name2 == name3); //false
        System.out.println(name3 == name4); //false

        System.out.println(name1.equals(name3)); //true equals 는 주소가 참조하는 값을 비교함을 알 수 이따
    }
}
