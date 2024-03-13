public class Main {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        print();
        print(b);  //'a'는 인스턴스화 됐기 때문에 사용X
    }

    public static void print() {
        System.out.println("Hello World");
    }
    public static void print(int x) {
        System.out.println(x);
    }
}