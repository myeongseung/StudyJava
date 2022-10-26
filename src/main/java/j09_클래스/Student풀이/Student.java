package j09_클래스.Student풀이;

//클래스명 : Student
//Properties(속성)-(멤버)변수
//schoolName
//studentCode
//studentYear
//name

//Function(기능) - (멤버)메소드
//increaseStudentYear() - 호출시에 현재 학년을 1학년 증가 (최대 5학년)
//showStudentInfo() - 호출시에 현재 학생들의 정보를 출력
//객체 = 데이터 + 기능 = 컴퓨터(pc)
//데이터(변수) = 모니터, 본체, 키보드, 마우스, 스피커 등(명사적인것들)
//기능(메소드) = 화면출력, 프로그램 실행, 입력, 소리출력등(기능적인것들)

public class Student {
    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    Student(){

    }
    Student(String schoolName, int studentCode, int studentYear, String name){
        this.schoolName = schoolName;
        this.name = name;
        this.studentYear = studentYear;
        this.studentCode = studentCode;
    }

    void increaseStudentYear() {
        studentYear += 1;
        if(studentYear > 5) {
            System.out.println("더 이상 학년을 증가시킬 수 없습니다.");
            studentYear -= 1;
            return; //방법1
        }
        showStudentInfo();
    }

    void increaseStudentYear(int year) {
        studentYear += year;
        if(studentYear > 5) {
            System.out.println(year + "학년을 더하면 " + studentYear + "학년이라 5학년을 넘어섭니다.");
            System.out.println();
            studentYear -= year;
            return; //방법1
        }
        showStudentInfo();
    }
    void decreaseStudentYear()
    {
        studentYear -= 1;
        if(studentYear < 1) {
            System.out.println("더 이상 학년을 감소시킬 수 없습니다.");
            studentYear += 1;
        }else{ //방법2
            showStudentInfo();
        }
    }

    void showStudentInfo(){
        System.out.println("학교 : " + schoolName);
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + studentCode);
        System.out.println("학년 : " + studentYear);
    }
}
