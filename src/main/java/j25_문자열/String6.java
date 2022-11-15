package j25_문자열;

public class String6 {

    public static void main(String[] args) {

        String httpRequest = "/user/1";

        /*
            문자열이 비어있지 않으면
            1. null -> x
            2. "" -> x
            3. " " -> x
         */
        if(!httpRequest.isBlank()){
            System.out.println(httpRequest);
//            if(httpRequest.replace(" ","").equals("")){
//                System.out.println(httpRequest);
//            }
        }else{
            System.out.println("공백은 사용할 수 없습니다.");
        }
    }

}
