package j19_컬렉션;
import java.util.*;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>();//업캐스팅 시켜서 사용
        //Set<String> strSet = new HashSet<String>();
        students.add(new Student(20220001, "김준일"));//이 곳에는 학생 객체가 들어감
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경호"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        System.out.println(students);

        /*
        문제1번 1. 김혜진 학생의 학번을 출력하세요
        문제2번 2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
        문제3번 3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.

        심화문제 : Set -> List 변환
        해당 List 를 학번의 순서에 맞게 정렬하시오
         */

        //1번 문제
        // 내코드 //강사님 코드랑 같음
        String searchName = "김혜진";
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println(searchName + "학생의 학번 : " + student.getId());
                break;
            }
        }

        //2번 문제
        //내코드
//        int searchId = 20220004;
//        for (Student student : students) {
//            if (student.getId() == searchId) {
//                students.remove(student);
//                students.add(new Student(searchId, "설민수"));
//                System.out.println(searchId + "의 이름이 " + student.getName() + "로 변경 되었습니다.");
//                break;
//            }
//        }

//        //강사님코드
//        int searchId = 20220004;
//        for (Student student : students) {
//            if (student.getId() == searchId) {
//                student.setName("설민수");
//                break;
//            }
//        }

//
//        //3번 문제
//        //내코드
//        int searchId2 = 20220001;
//        for (Student student : students) {
//            if (student.getId() == searchId2) {
//                students.remove(student);
//                System.out.println(searchId2 + "가 삭제 되었습니다.");
//                break;
//            }
//        }
//        System.out.println(students);

        //심화 문제
//        List<Student> listStudents = new ArrayList<Student>(); //Set을 담을 List생성
//        for (Student student : students) {
//            listStudents.add(new Student(student.getId(), student.getName()));
//        }
//        boolean flag = true;
//        List<Student> sortStudents = new ArrayList<Student>();
//        //3 5 6 1 2 4
//        int searchId3 = 1000000000;
//        for(int i=0;i<listStudents.size();i++){
//            for(int j=0;j< listStudents.size();j++){
//                Student student = listStudents.get(i);
//                if(student.getId() < searchId3){
//                    searchId3 = student.getId();
//                }
//            }
//            System.out.println(searchId3);
//        }
//
//        System.out.println(listStudents);
//        System.out.println(sortStudents);
        int cmpId = 20220000;
        List<Student> sortStudents = new ArrayList<Student>();
        for(int i=0;i<students.size();i++){
            cmpId++;
            for(Student student : students){
                if(student.getId() == cmpId){
                    sortStudents.add(student);
                }
            }
        }
        System.out.println(sortStudents);

//        for(Student student : listStudents){
//
//        }
//        for(Student student : listStudents){
//            System.out.println(student);
//        }


    }
}