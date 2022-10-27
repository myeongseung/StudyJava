package j11_배열.StudentManagement;

public class StudentRepository { //저장소
    private Student[] students;

    public StudentRepository(){
        students = new Student[0];
    }
    public void addStudent(Student student){
        int index = indexOfEmpty();

        if(index == -1){ //이러면 배열 자리에 공간이 없다는 뜻임.
            index = increaseArray();
        }

        students[index] = student;
    }

    //밑에꺼 꼭 다시보고 공부해라
    private int indexOfEmpty(){ //비어있는 index공간을 알려준다.
        for(int i=0;i< students.length;i++)
        {
            if(students[i] == null){ //null이면 공간이 있다.
                return i;
            }
        }
        return -1; //-1을 받으면 무조건 공간이 없다.
    }

    private int increaseArray(){
        Student[] tempArray = new Student[students.length+1];
        //students.length가 빈공간이면 이것보다 크기가 1큰 새로운 배열을 생성함.
        //그러면 tempArray라는 꽉찬 배열보다 크기가 1큰 배열을 생성해줌.
        for(int i=0;i< students.length;i++)
        {
            tempArray[i] = students[i]; // 앞에 있던 배열에 각각인덱스의 값들을 tempArray 각각 인덱스
            //에다가 넣고 맨마지막 인덱스만 비어있음.
        }
        students = tempArray; //이렇게하면 students에 새로운 공간이 하나 늘어남 즉 배열의 크기가 1커짐.

        return tempArray.length -1;
    }
}
