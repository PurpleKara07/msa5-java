package org.example.e03if;

public class E03If {
    public static void main(String[] args) {
        // IF로 만들어주세요.
        // 성적
        // 범위 :
        //		100   : A+
        //		90이상 100미만 : A
        //		80이상 90미만 : B
        //		70이상 80미만 : C
        //		60이상 70미만 : D
        //		60미만: F

        //출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"
        /*
         *  0~100 숫자가 입력될 경우 오동작한다.
         *  그외 패턴은 기존과 동일
         */

        int grade   = 101;
        String msg  = null;
        boolean bol = false;

        if(grade > 100 || grade < 0) {
            bol = true;
        }else if(grade == 100) {
            msg = "A+";
            bol = false;
        }else if(grade >= 90) {
            msg = "A";
            bol = false;
        }else if(grade >= 80) {
            msg = "B";
            bol = false;
        }else if(grade >= 70) {
            msg = "C";
            bol = false;
        }else if(grade >= 60) {
            msg = "D";
            bol = false;
        }else if(grade < 60) {
            msg = "F";
            bol = false;
        }
        if(bol){
            System.out.println("유효한 점수가 아닙니다.");
        }else{
            System.out.printf("당신의 점수는 %d. <%s>등급입니다.", grade, msg);
        }

        // Switch문
        int num = 2;
        switch(num){
            case 1:
                System.out.println("1등");
                break;
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }
    }
}
