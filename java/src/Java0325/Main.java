package Java0325;

public class Main {
    public static void main(String[] args) {
     JavaAbstract javaAbstract = new JavaAbstract();
     System.out.println(javaAbstract.getValue());
     System.out.println(javaAbstract.getString());

     JavaAbstract javaAbstract1 = new JavaAbstract(20,"Apple");
     System.out.println(javaAbstract.getValue());
     System.out.println(javaAbstract.getString());
    }
}
