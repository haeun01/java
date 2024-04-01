package Java0313;

// 상속 관계 만들기
class A {}
class B extends A {}
class C extends B {}
class D extends B {}
public class Polymorphism0313 {
    public static void main(String[] args) {
        // Java240313.A 타입의 다형적 표현
        A a1 = new A();    // A는 A이다. (O)
        A a2 = new B();    // B는 A이다. (O)
        A a3 = new C();    // C는 A이다. (O)
        A a4 = new D();    // D는 A이다. (O)

        // Java240313.B 타입의 다형적 표현
//      Java240313.B b1 = new Java240313.A();    // B는 A이다. (X)
        B b2 = new B();    // B는 B이다. (O)
        B b3 = new C();    // B는 C이다. (O)
        B b4 = new D();    // B는 D이다. (O)

        // Java240313.C 타입의 다형적 표현
//      Java240313.C c1 = new Java240313.A();    // C는 A이다. (X)
//      Java240313.C c2 = new Java240313.B();    // C는 B이다. (X)
        C c3 = new C();    // C는 C이다. (O)
//      Java240313.C c4 = new Java240313.D();    // B는 B이다. (X)

        // Java240313.D 타입의 다형적 표현
//      Java240313.D d1 = new Java240313.A();    // D는 A이다. (X)
//      Java240313.D d2 = new Java240313.B();    // D는 B이다. (X)
//      Java240313.D d3 = new Java240313.C();    // D는 C이다. (X)
        D d4 = new D();    // D는 D이다. (O)

        //#1. 업캐스팅 (자동변환): 생략시 컴파일러가 자동 추가
        A ac = (A)new C(); // C->A 업캐스팅 (자동변환)
        B bc = (B)new C(); // C->B 업캐스팅 (자동변환)

        B bb = new B();
        A a = (A)bb; //B->A 업캐스팅 (자동변환)

        //#2-1. 다운캐스팅 (수동변환) : 캐스팅이 불가능한 경우 (실행시 예외발생)
        A aa = new A();
//		B b = (B)aa; //A->B 다운캐스팅 (수동변환)
//		C c = (C)aa; //A->C 다운캐스팅 (수동변환)

        //#2-2. 다운캐스팅 (수동변환) : 캐스팅이 가능한 경우
        A ab = new B();
        B b = (B)ab; //A->B 다운캐스팅 (수동변환)
//		C c = (C)ab; //A->C 다운캐스팅 (수동변환) : 불가능

        B bd = new D();
        D d = (D)bd; //B->D 다운캐스팅 (수동변환)
        A ad = new D();
        B b1 = (B)ad; //A->B 다운캐스팅 (수동변환)
        D d1 = (D)ad; //A->D 다운캐스팅 (수동변환)

    }
}
