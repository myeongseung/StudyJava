package j10_접근지정자;

//AccessModifier 접근지정자
public class StudentAccessModifier {
    private int code;
    private String name;

    public StudentAccessModifier(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("학번: " + code);
        System.out.println("이름: " + name);
    }

}
