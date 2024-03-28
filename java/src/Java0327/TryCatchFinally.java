package Java0327;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 1);    // 실행 예외(ArithmeticException)
            int a = Integer.parseInt("20");
            int[] arr = {1,2,3,4,5};
            arr[5] = 6; //ArrayIndexOutBoundsException 발생
        } catch (ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다.");
            System.out.println("프로그램 종료2");
        }
        catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        }
        catch (NullPointerException e) {
            System.out.println("Null 관리 좀 잘하자");
        }
        catch (Exception e) {
            System.out.println("예기치 못한 에러로 인하여 프로그램을 종료한다.");
        }  //상위에 있는 Exception은 항상 마무리에 작성해주기 (위쪽에다가 적으면 아래 있는 애들이 수행되지 X)
        finally {
            System.out.println("프로그램 종료3");
        }
    }
}
