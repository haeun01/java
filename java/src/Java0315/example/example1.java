package Java0315.example;

public class example1 {
    static void bubble(int[] arr) {
        // bubbleSort : 숫자를 정렬하는 알고리즘 (나쁜 방법 : 가장 기초적인 정렬법으로 대규모 개발에는 효율성이 많이 떨어진다.)
        // n * n
        // max 값 찾는 걸 n번 하는 고전 방법
        int n = arr.length;
        int temp = 0;   // 정렬 : 매우 큰 수가 뒤로 간다.
        for(int i=0; i < n; i++){  // n만큼 순회
            for(int j=1; j < (n-i); j++){
                // n-i (n은 고정값, i는 늘어남) 순회하는 갯수가 줄어듦 (비교횟수가 줄어듬 : 효율을 좀 더 높이기 위해서)
                // 큰 놈을 제일 오른쪽에 놓아야 끝남
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubble(arr);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
