package j06_조건;

import java.util.Scanner;
/*
* 문제
* 조건 : score가 0보다 작거나 100보다 크면 grade 는 x
*
* */


public class Condition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수을 입력하세요 : ");
        int score = scanner.nextInt(); //점수
        String grade = null; //학점

//        if(score >= 0 && score <= 100)
//        {
//            if(score > 89){
//                grade = "A";
//            }else if(score > 79){
//                grade = "B";
//            }else if(score > 69){
//                grade = "C";
//            }else if(score > 59){
//                grade = "D";
//            }else if(score > -1) {
//                grade = "F";
//            }
//        }else{
//            grade = "X";
//        }
//        System.out.println("점수는 " + score + "점 이며 학점은 " + grade + "입니다.");
//
        if(score < 0 || score > 100){
            grade = "X";
        }else if(score > 89){
            grade = "A";
        }else if(score > 79){
            grade = "B";
        }else if(score > 69){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("점수는 " + score + "점 이며 학점은 " + grade + "입니다.");
    }
}