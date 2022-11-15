package j25_문자열;

import java.util.StringTokenizer;

public class String1 {

    public static void main(String[] args) {

        /*
        subString() -> 문자열을 잘라준다.
        indexOf() -> 내가 찾는 문자열의 위치 인덱스를 반환.
         */

        String filePath2 = "C:/myeongseung/web-3-202210/java202210myeongseung/src/main/java/String.java";
        String filePath = "C:/myeongseung/web-3-202210/java202210myeongseung/src/main/java/Integer.java";
//        String projectName = "java202210myeongseung";
//        String fileName = "String";
//        String extension = ".java";

//        System.out.println("프로젝트명 : " + projectName);
//        System.out.println("파일명 : " + fileName);
//        System.out.println("확장자명 : " + extension);
//
//        StringTokenizer C = new StringTokenizer(fileFath,"/"); //C:
//        System.out.println(C.nextToken());
//
//        System.out.println(fileFath.indexOf("/")); //2
//        System.out.println(fileFath.indexOf("/",3)); //14
//        System.out.println(fileFath.indexOf("/",15)); //27 java202210myeongseung
//        System.out.println(fileFath.indexOf("/",28)); //49 src
//        System.out.println(fileFath.indexOf("/",50)); //53 main
//        System.out.println(fileFath.indexOf("/",54)); //58 java
//        System.out.println(fileFath.indexOf("/",59)); //63 String.java
//        System.out.println(fileFath.indexOf(".",64)); //64 String
//        //70~75.java
//
//        System.out.println(fileFath.substring(28,49));
//        System.out.println(fileFath.substring(64,70));
//        System.out.println(fileFath.substring(70,75));
//        for(int i=0;i<tokens.length;i++){
//
//        }

        String []tokens = filePath.split("/");
        System.out.println("프로젝트 명 : " + tokens[3]);
        int idx = tokens[7].indexOf(".");
        String token2 = tokens[7].substring(0,idx);
        String token3 = tokens[7].substring(idx+1);
        System.out.println("파일명 : " + token2);
        System.out.println("확장자명 : " + token3);

//        String []tokens2 = fileFath.split(".");
//        for(int i=0;i<tokens2.length;i++){
//            System.out.println(tokens2[i]);
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println(tokens[3]);
//        System.out.println(tokens[5]);
//        System.out.println(tokens[7]);
//
//        for(int i=0;i<)
//        boolean flag = true;
//        String fileName2;
//        String fileName3;
//        String fileName4;
//        String fileFath = "C:/myeongseung/web-3-202210/java202210myeongseung/src/main/java/String.java";
//
//        int idx = fileFath.indexOf("/");
//        while(flag){
//            fileName2 = fileFath.substring(0,idx);
//            fileName3 = fileFath.substring(idx + 1);
//            if (idx == -1) {
//                flag = false;
//            }else{
//                int idx2 = fileName2.indexOf("/");
//                fileName4 = fileName3.substring(0,idx);
//                String fileName5 = fileName3.substring(idx+1);
//                fileName5 = fileName4;
//                System.out.println(fileName4);
//            }
//        }

//        String fileName2 = fileFath.substring(0,idx);
//        String fileName3 = fileFath.substring(idx+1);
//        System.out.println(fileName2);
//        System.out.println(fileName3);

//        StringTokenizer ab = new StringTokenizer(tokens[7],".");
//        String token = ab.nextToken();
//        token.substring();
//        System.out.println(token); //String


        //강사님 코드
        int srcIndex = filePath.indexOf("/src");
        String projectPath = filePath.substring(0,srcIndex);
        String projectName = projectPath.substring(projectPath.lastIndexOf("/")+1);
        String fileName = filePath.substring(filePath.lastIndexOf("/")+1,filePath.lastIndexOf("."));
        String extension = filePath.substring(filePath.lastIndexOf("."));
        System.out.println(projectName);
        System.out.println(fileName);
        System.out.println(extension);

    }

}
