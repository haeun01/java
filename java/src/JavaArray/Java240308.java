package JavaArray;

import App.Student;

public class Java240308 {
    public static void main(String[] args) {
        Student tom = new Student("Tom", 18, "Daejeon", "123456");
        Student steve = new Student("Steve", 25, "Seoul","246810");
        Student paul = new Student();
        paul.setName("Paul");
        paul.setAge(22);
        paul.setAddress("Incheon");
        tom.displayAll();
        steve.displayAll();
        paul.displayAll();

        System.out.println(tom.getPersonalNum());

        // 메소드 호출
        int[] numberList = {12, 34, 56, 32, 84, 99, 73,69};
        int[] numberList2 = {123, 345, 235, 7898, 467};
        getSumAvg(numberList);
        getSumAvg(numberList2);
    }

    static void  getSumAvg(int[] numberList) {


        //합계
        int sum = 0;
        for(int i = 0; i < numberList.length; i++) {
            sum = sum + numberList[i];
        }

        //평균
        int average = sum / numberList.length;
        System.out.println(sum + " " + average);
    }
}
