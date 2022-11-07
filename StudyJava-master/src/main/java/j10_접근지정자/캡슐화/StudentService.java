package j10_접근지정자.캡슐화;

public class StudentService {

    public void registerStudent() {
        System.out.println("[ 학생 정보 등록 메뉴 ]");
        System.out.println("먼저 중복된 학생 정보인지 확인합니다.");
        doubleCheckStudent("김준일");
        //if(getName == setName){}
        //등록하면서 이 기능을 넣으면됨. 결국 doubleCheckStudnet얘는
        //내부에서만 쓰니까 private임

        System.out.println("학생 정보를 등록합니다.");

    }
    private boolean doubleCheckStudent(String studentName){
        if(studentName.equals("김준일")){
            return false;
        }
        return true;
    }


}
