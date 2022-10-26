package j09_클래스.Student풀이;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("부산대학교",12345678,1,"김준일");
        Student student2 = new Student("부경대학교",87654321,3,"김준이");
        Scanner scanner = new Scanner(System.in);
//        student1.showStudentInfo();
//        student2.showStudentInfo();

//        for(int i=0;i<10;i++)
//        {
//            student1.increaseStudentYear();
//            student2.increaseStudentYear();
//        }
//        System.out.println();

//        for(int i=0;i<10;i++)
//        {
//            student1.decreaseStudentYear();
//            student2.decreaseStudentYear();
//        }
        student1.increaseStudentYear(8);
        student1.showStudentInfo();
        student2.showStudentInfo();
    }
}
