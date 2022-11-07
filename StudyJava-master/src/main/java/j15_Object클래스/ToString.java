package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일","부산");
        Teacher teacher = new Teacher("김준일2","코리아대학교");

        System.out.println(objectTest);
        String str = objectTest.toString(); //toString을 이용하여 형변환
        System.out.println(str);

        System.out.println(teacher);
    }
}
