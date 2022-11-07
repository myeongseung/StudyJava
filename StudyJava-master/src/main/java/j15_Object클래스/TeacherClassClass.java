package j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        Teacher teacher2 = new Teacher("김준일","코리아아이티");

        Class t_class = teacher1.getClass(); //teacher 클래스의 정보를 가져온다.
        //class class 란 클래스들의 정보를 가지고있다.


        System.out.println(t_class.getSimpleName()); //SimpleName 클래스명
        System.out.println(t_class.getName()); //주소
        Field[] fields = t_class.getDeclaredFields(); //
        for(int i =0;i<fields.length;i++)
        {
            System.out.println(fields[i].getName()); //name schoolName
            System.out.println(fields[i].getType()); //name 의 타입 schoolName 의 타입
        }
        Method[] methods = t_class.getDeclaredMethods();
        for(int i=0;i< methods.length;i++)
        {
            System.out.println(methods[i].getReturnType());
        }
        System.out.println(teacher1.getClass()==teacher2.getClass()); //클래스정보
        System.out.println(teacher1 instanceof Teacher); //instanceof 해당 객체가 얘로 인해 생겨낫냐?
        System.out.println(teacher1.getClass() == Teacher.class); //얘는 뭔데같음?
        System.out.println(Teacher.class); //class j15_Object클래스.Teacher
        System.out.println(teacher1.getClass());//class j15_Object클래스.Teacher
    }
}
