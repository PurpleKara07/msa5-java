package org.example.e06oop.polymorphism;

public class PolimorphismMain {
    public static void main(String[] args) {
        Whale whale1  = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();

        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Monkey();

        // ---------------------------
        // 없캐스팅 : 자식 클래스가 부모 클래스 타입으로 캐스팅
        // 부모 클래스로 캐스팅되면 자식클래스에 있는 멤버는 접근 불가능
        Mammal upCasting1 = new Whale();

        // 다운캐스팅 : 업캐스팅한 이스턴스를 다시 본인의 데이터 타입으로 캐스팅
        Whale downCasting1 = (Whale) upCasting1;    // (Whale) 데이터 타입
        downCasting1.swimming();
    }
}
