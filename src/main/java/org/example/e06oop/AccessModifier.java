package org.example.e06oop;

public class AccessModifier {
    //  default     : 같은 패키지에 소속된 클래스에서만 접근
    String strDefault = "Default";
    //  public      : 클래스 내/외부 어디서나 접근
    public String strPublic = "Public";
    //  private     : 클래스 내부에서만 접근
    private String strPrivate = "Private";
    //  protected   : 같은 패키지 / 클래스 내부 / 상속받은 자식에서만 접근
    protected String strProtected = "Protected";

    void fnDefault(){
        System.out.println("Default Fn");
    }
    public void fnPublic(){
        System.out.println("Public Fn");
    }
    private void fnPrivate(){
        System.out.println("Private Fn");
    }
    protected void fnProtected(){
        System.out.println("Protected Fn");
    }

    public Whale getStrPrivate(){
        return new Whale();     // 주소가 반환
    }
}
