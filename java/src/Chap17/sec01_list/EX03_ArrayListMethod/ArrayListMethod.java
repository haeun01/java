package Chap17.sec01_list.EX03_ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
	public static void main(String[] args) {
		
		List<Integer> aList1 = new ArrayList<Integer>(); //제네릭 인터페이스를 상속한 인터페이스(List 생성)_컬렉션을 상속하고 있음
		
		//#1. add(E element)
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString()); //=~.println(aList1) [3, 4, 5]
		
		//#2. add(int index, E element)
		aList1.add(1, 6);
		System.out.println(aList1.toString()); //[3, 6, 4, 5]
		
		//#3. addAll(또 다른 리스트 객체)
		List<Integer> aList2 = new ArrayList<>();
		aList2.add(1);
		aList2.add(2);
		aList2.addAll(aList1); //뒤에 붙이는 문법
		System.out.println(aList2); //[1, 2, 3, 6, 4, 5]
		
		//#4. addAll(int index, 또 다른 리스트 객체)
		List<Integer> aList3 = new ArrayList<>();
		aList3.add(1);
		aList3.add(2); //[1 2]
		aList3.addAll(1, aList3); //본인을 복사해서 본인에게 넣음
		System.out.println(aList3); //[1, 1, 2, 2]
		
		//#5. set(int index, E element)
		// 값의 변경 (업데이트)
		aList3.set(1,5);
		aList3.set(3,6);
		//aList3.set(4,7); //java.lang.IndexOutOfBoundsException:		
		System.out.println(aList3); //[1, 5, 2, 6]
		
		//#6. remove(int index)
		aList3.remove(1); //1번 인덱스를 삭제하라는 문법
		System.out.println(aList3); //[1, 2, 6]
		
		//#7. remove(Object o)
		aList3.remove(new Integer(2));
		System.out.println(aList3); //[1, 6]
		
		//#8. clear()
		aList3.clear();
		System.out.println(aList3); //[]
		
		//#9. isEmpty()
		System.out.println(aList3.isEmpty()); //true
		
		//#10. size()   //length 와 같은 역할
		System.out.println(aList3.size());//0
		aList3.add(1);
		aList3.add(2);
		aList3.add(3);
		System.out.println(aList3); //[1, 2, 3]
		System.out.println(aList3.size());//3
		
		//#11.get(int index)
		System.out.println("0번째 : " + aList3.get(0)); //1
		System.out.println("1번째 : " + aList3.get(1)); //2
		System.out.println("2번째 : " + aList3.get(2)); //3
		for(int i=0; i<aList3.size(); i++)
			System.out.println(i+"번째 : "+aList3.get(i));
		
		//#12. toArray() List-->Array //특정 데이터 타입을 지정해주는 문법
		Object[] object = aList3.toArray();
		System.out.println(Arrays.toString(object)); //[1, 2, 3]
		
		//#13-1. toArray(T[] t) -->  T[]
		Integer[] integer1 = aList3.toArray(new Integer[0]);  // 모두 달라는 문법
		System.out.println(Arrays.toString(integer1));
		
		//#13-2. toArray(T[] t) -->  T[]
		Integer[] integer2 = aList3.toArray(new Integer[5]);  //앞에서부터 5개만 달라는 문법
		System.out.println(Arrays.toString(integer2));				
	}
}

































