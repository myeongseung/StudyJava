package j11_배열.StudentManagement;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class StudentService {

    private Scanner scanner; //필수값
    private StudentRepository studentRepository; //필수값

    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }

    public void showStudents() {
        Student[] students = studentRepository.getStudents();
        for(int i=0;i<students.length;i++) {
            Student student = students[i];
            if(student != null)
            {
                student.showStudentInfo();
            }
        }
    }
    public void registerStudent() {
        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[학생정보 등록]");
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name, kor, math, eng);

        studentRepository.addStudent(student);
    }
    private int indexOf(){
        String name;
        //System.out.println("[학생 정보 이름으로 조회]");
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();

        return studentRepository.findStudentByName(name);
    }

    public void showStudent() {
        System.out.println("[검색한 학생 정보 출력]");
       int index = indexOf();

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 없습니다.");
            return;
        }
        studentRepository.getStudent(index).showStudentInfo(); //이 부분은 신기함
        System.out.println("조회 완료!\n");
    }

    public void deleteStudent(){
        int index = indexOf();
        if (index == -1) {
            System.out.println("입력한 이름의 학생은 없습니다.");
            return;
        }
        studentRepository.removeStudent(index).showStudentInfo();
        System.out.println("삭제완료!\n");
    }

    public void modifyStudent(){
        System.out.println("학생 정보 이름으로 수정");
        int index = indexOf();
        int kor;
        int eng;
        int math;

        if (index == -1) {
            System.out.println("입력한 이름의 학생은 없습니다.");
            return;
        }

        System.out.print("국어 : ");
        kor = scanner.nextInt();
        System.out.print("수학 : ");
        math = scanner.nextInt();
        System.out.print("영어 : ");
        eng = scanner.nextInt();
        Student updateStudent = new Student(null,kor,eng,math);
        studentRepository.updateStudent(index,updateStudent);
        System.out.println("수정 완료!\n");
    }
}
