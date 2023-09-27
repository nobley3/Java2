package java2prj1.interfaceEx.myarrys;

import java.util.Comparator;

public class ScoreTest3 {

	public static void main(String[] args) {

		Score2[] list = new Score2[4];

		list[0] = new Score2(100, 90);
		list[1] = new Score2(80, 99);
		list[2] = new Score2(99, 87);
		list[3] = new Score2(70, 60);

//		객체배열 출력

		for (Score2 score : list) {
			System.out.println(score);
		}
		
		MyArrays.sort(list);

		System.out.println("정렬후 ==>");
		for (Score2 score : list) {
			System.out.println(score);
		}
		
		//1.익명클래스
		MyArrays.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				return s1.kor-s2.kor;
			}});
		//2.인터페이스를 구현한 클래스르 작성하고 사용
		class ComparatorImp implements Comparator{

			@Override
			public int compare(Object o1, Object o2) {
				Score2 s1 = (Score2)o1;
				Score2 s2 = (Score2)o2;
				return s1.kor-s2.kor;
				
			}
			
		}
		MyArrays.sort(list, new ComparatorImp());
		System.out.println("정렬후 ==>");
		for (Score2 score : list) {
			System.out.println(score);
		}
	}
}
