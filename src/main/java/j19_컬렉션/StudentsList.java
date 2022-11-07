package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;


public class StudentsList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(); //업캐스팅 시켜서 사용
        students.add(new Student(20220001, "김준일"));//이 곳에는 학생 객체가 들어감
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        for(Student student : students){
            if(student.getName().equals(searchName)){
                System.out.println(searchName+" 학생의 학번 : " + student.getId());
            }

        }
        for(int i=0;i<students.size();i++)
        {
            Student student = students.get(i); //이렇게 생성
            if(student.getName().equals(searchName)){
                System.out.println(searchName + "학생의 학번 : " + students.get(i).getId());
                break;
            }
        }

        int searchId = 20220002;
        for(Student student : students)
        {
            //Student student = students.get(i); //이렇게 생성
            if(student.getId() == searchId){
                students.remove(students.indexOf(student));
                break;
            }
        }
        for(int i=0;i<students.size();i++)
        {
            Student student = students.get(i); //이렇게 생성
            if(student.getId()==searchId){
                students.remove(students.indexOf(student));
                break;
            }
        }
        for(int i=0;i< students.size();i++)
        {
            Student student = students.get(i); //이렇게 생성
            int index = student.getId();
            System.out.println(index);
        }



    }

}
