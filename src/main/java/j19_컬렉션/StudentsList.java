package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
        int searchId = 20220003;
//
//        for(Student student : students){
//            if(student.getName().equals(searchName)){
//                System.out.println(searchName+" 학생의 학번 : " + student.getId());
//            }
//
//        }
//        for(int i=0;i<students.size();i++)
//        {
//            Student student = students.get(i); //이렇게 생성
//            if(student.getName().equals(searchName)){
//                System.out.println(searchName + "학생의 학번 : " + students.get(i).getId());
//                break;
//            }
//        }
//        for(Student student : students) //for each
//        {
//            //Student student = students.get(i); //이렇게 생성
//            if(student.getId() == searchId){
//                students.remove(students.indexOf(student));
//                break;
//            }
//        }
//        for(int i=0;i<students.size();i++)
//        {
//            Student student = students.get(i); //이렇게 생성
//            if(student.getId()==searchId){
//                students.remove(students.indexOf(student));
//                break;
//            }
//        }
//        for(int i=0;i< students.size();i++)
//        {
//            Student student = students.get(i); //이렇게 생성
//            int index = student.getId();
//            System.out.println(index);
//        }



        /*
         *  id = 20220003학생을 찾아서 그 학생의 이름이 김규민이면
         *  김경민으로 바꿔라
         * */

        //강사님 코딩
//        for(Student student : students){
//            if(student.getId() == searchId && student.getName().equals(searchName)){
//                student.setName("김경민");
//                break;
//            }
//        }

        //내 코딩
//        for(Student student : students){
//            if(student.getId() == searchId){
//                if(student.getName().equals(searchName)){
//                    student.setName("김경민");
//                    break;
//                }
//                break;
//            }
//        }
//
//        for(Student student : students){
//            System.out.println(student);
//        }
        //내코딩
        String searchName2 = "박경호";
//        for(Student student : students){
//            Iterator<Student> iterator = students.iterator();
//            while(iterator.hasNext()){
//                if(student.getName().equals("박경호")){
//                    student.setName("박찬호");
//                    System.out.println(iterator.next());
//                    break;
//                }
//            }
//        }
        //강사님 코드
//        Iterator<Student> iterator = students.iterator();
//        while(iterator.hasNext()){
//            Student student = iterator.next();
//            if(iterator.next().getName().equals(searchName2)){
//                student.setName("박창우");
//                break;
//            }
//        }
//        for(Student student : students) {
//            System.out.println(student);
//        }
        //List<Student> students = new ArrayList<Student>();
        List<Student> reverseStudents = new ArrayList<Student>();

        //강사님 코드
//        for(int i=0;i<students.size();i++){
//            reverseStudents.add(students.get(students.size()-1-i));
//        }
//        for(Student student : students){
//            reverseStudents.add(0,student);
//        }//??
//        Collections.reverse(reverseStudents);
//        System.out.println(reverseStudents);
//
//        //내 코드
        for(int i=students.size()-1;i>=0;i--){
            reverseStudents.add(students.get(i));
        }
        for(Student reverseStudent : reverseStudents){
            System.out.println(reverseStudent);
        }

        //다음 문제
        /*
        * idList
        * nameList
        *
        * */
        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

//        for(Student student : students){
//            idList.add(student.getId());
//        }

        //강사님 코드
//        for(Student student : students){
//            idList.add(student.getId());
//            nameList.add(student.getName());
//        }
        //내코드
        for(int i=0;i<students.size();i++){
            Student student = students.get(i);
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear();
        System.out.println(students);
        //다시 students 에 넣기
        //강사님 코드
        for(int i =0;i<idList.size();i++)
        {
            idList.get(i);
            nameList.get(i);
            Student student = new Student(idList.get(i),nameList.get(i));
            students.add(student);
        }


    }

}
