package j19_컬렉션;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<Student>(); //업캐스팅 시켜서 사용
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
        해당 List를 학번의 순서에 맞게 정렬하시오
         */
    }
}
