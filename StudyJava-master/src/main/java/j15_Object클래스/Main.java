package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일","부산");
        int hashCode = objectTest.hashCode();

        System.out.println(hashCode);//1239731077출력
        System.out.println(Integer.toHexString(hashCode));//toHexString16진수로바꿔라
        //49e4cb85 16진수로 나타내면 해당 객체의 실제 주소값
        System.out.println(objectTest);//j15_Object클래스.ObjectTest@49e4cb85


    }
}
