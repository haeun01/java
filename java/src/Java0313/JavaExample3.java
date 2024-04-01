package Java0313;

public class JavaExample3 {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 5};
        // 2 3 4 5 1
        // 3 4 5 1 2
        // 4 5 1 2 3

        int n = 3;  // n 횟수만큼 뒤로 넘어가는 것 (외부 입력을 받아서 처리할 수 있음)

        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 0; i < n; i++){
            int j, first;

            first = arr[0];  // 포인트 1 : arr.length-1 를 지정하는 이유(arr[j+1] 때문에)
            for(j = 0; j < arr.length-1; j++){
                arr[j] = arr[j+1]; // j의 최댓값 3
            }
            arr[j] = first;  // 포인트 2 : for문에서 나왔을 때, 인덱스의 가장 마지막 자리 j = 4
        }
        System.out.println();

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
