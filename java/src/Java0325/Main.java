package Java0325;

public class Main {
    public static void main(String[] args) {
     //JavaAbstract javaAbstract = new JavaAbstract(); //추상클래스는 인스턴스화 안됨
     JavaChild javaChild = new JavaChild();     //추상클래스를 상속한 클래스는 인스턴스화 가능
     System.out.println(javaChild.getValue());
     System.out.println(javaChild.getString());

     JavaChild javaAbstract1 = new JavaChild (20,"Apple"); //호출할 때 (아규먼트) / 값을 받는 요소 (파라미터)
     System.out.println(javaAbstract1.getValue());
     System.out.println(javaAbstract1.getString());

     JavaChild javaChild2 = new JavaChild();
     javaChild2.setValue(999);
     javaChild2.setString("Banana");
     System.out.println(javaChild2.getValue());
     System.out.println(javaChild2.getString());
    }
}
