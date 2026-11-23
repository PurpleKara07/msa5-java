package org.example.e11enum;

public class MainEnum {
    public static void main(String[] args) {
        // System.out.println(Weeks.MONDAY);
        // System.out.println(Weeks.TUESDAY);
        // System.out.println("1234567".equals(Weeks.TUESDAY));
        Weeks monday = Weeks.MONDAY;
        System.out.println(monday);
        System.out.println(monday.name());
        System.out.println(monday.getKrDay());
        // ordinal() 절대 사용하지 말것 : 연산순서 보장 못함
        System.out.println(Weeks.TUESDAY.ordinal());
        System.out.println(Weeks.TUESDAY.getDayNum());
    }
}
