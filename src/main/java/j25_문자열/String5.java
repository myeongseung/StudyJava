package j25_문자열;

public class String5 {

    //equalsIgnoreCase 영문자를 대소문자 구분없이 비교하라.
    public static void main(String[] args) {
        String httpMethod = "Get";
        //String toLowerMethod = httpMethod.toLowerCase();

        if(httpMethod.equalsIgnoreCase("GET")){
            System.out.println("Get요청입니다.");
        }else{
            System.out.println("Get요청이 아닙니다.");
        }
    }
}
