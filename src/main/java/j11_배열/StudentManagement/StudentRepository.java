package j11_배열.StudentManagement;

public class StudentRepository { //저장소
    private Student[] students;

    public StudentRepository(){
        students = new Student[0]; //크기가 0인 students 배열을 생성
    }
    public void addStudent(Student student){
        int index = indexOfEmpty();

        if(index == -1){ //이러면 배열 자리에 공간이 없다는 뜻임.
            index = increaseArray(); //아까 indexOfEmpty메소드에서 빈공간이 없으면 -1을 반환 받은게
            //아까 리턴받은 빈자리의 번호 혹은 -1을 받는다.
            //index가 increaseArray메소드로 가서 배열의 크기 1증가.
        }

        students[index] = student;
    }

    private int indexOfEmpty(){ //비어있는 index공간을 알려준다.
        for(int i=0;i< students.length;i++)
        {
            if(students[i] == null){ //null이면 공간이 있다.
                return i; //빈공간이 있으면 빈자리의 번호를 리턴해준다.
            }
        }
        return -1; //배열중에 빈공간이 없을시 -1을 반환함 index로
    }

    private int increaseArray(){ //배열의 크기를 1증가시키는 메소드
        Student[] tempArray = new Student[students.length+1]; //임시배열 tempArray
        //students.length가 빈공간이면 이것보다 크기가 1큰 새로운 배열을 생성함.
        //그러면 tempArray라는 꽉찬 배열보다 크기가 1큰 배열을 생성해줌.
        for(int i=0;i< students.length;i++)
        {
            tempArray[i] = students[i]; // 앞에 있던 배열에 각각인덱스의 값들을 tempArray 각각 인덱스
            //에다가 넣고 맨마지막 인덱스만 비어있음. 배열의 크기가 1이큰 새로운 배열에 기존의 값들을 저장
        }
        students = tempArray; //이렇게하면 students에 새로운 공간이 하나 늘어남 즉 배열의 크기가 1커짐.
        //students 속에 tempArray를 다시넣음
        return tempArray.length -1;
    }

    public Student[] getStudents(){
        return students;
    }

    public int findStudentByName(String name) {
        for(int i=0;i<students.length;i++){
            if(students[i] != null)
            {
                if(students[i].getName().equals(name)){
                    return i;
                }
            }

        }
        return -1;
    }
    public Student getStudent(int index){ //Student가 자료형;;
        return students[index];
    }

    public Student removeStudent(int index){
        Student student = students[index];
        students[index] = null;
        return student;
    }

    public Student updateStudent(int index, Student updateStudent){
        Student student = students[index];
        student.updateStudent(updateStudent);
        return student;
    }
}
