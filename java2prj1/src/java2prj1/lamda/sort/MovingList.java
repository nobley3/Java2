package java2prj1.lamda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class MovingList {

	public static void main(String[] args) {

		ArrayList<Moving> list = new ArrayList<>();
		list.add(new Moving("장주원", "구룡포", 100));
		list.add(new Moving("이미현", "경기", 80));
		list.add(new Moving("김두식", "문산", 90));
		list.add(new Moving("전영석", "봉평", 88));

//		이름순으로 정렬
		
		Collections.sort(list);
		list.forEach(m -> System.out.println(m));
		
		System.out.println("이름순1------------>");
		list.forEach(new Consumer<>() {

			@Override
			public void accept(Moving t) {
				System.out.println(t);

			}});
		System.out.println("이름순2------------>");
		class ConsumerImp implements Consumer<Moving>{

			@Override
			public void accept(Moving t) {
				
			System.out.println(t);
				
			}
		}
		
		list.forEach(new ConsumerImp());
		System.out.println("이름순3------------>");
		
		
//		암호순으로 정렬
		
		Collections.sort(list, new Comparator<Moving>() {

			@Override
			public int compare(Moving o1, Moving o2) {
				 
				return o1.code.compareTo(o2.code);
			}
			//String 일 경우에는 compareTo 사용한다
		});
		System.out.println("코드순 ------------>");		
		list.forEach(new ConsumerImp());
		
//		파워순으로 정렬
		Collections.sort(list, new Comparator<Moving>() {
			@Override
			public int compare(Moving o1, Moving o2) {
				// TODO Auto-generated method stub
				return o1.power -o2.power;
			}
 
		});
		
		System.out.println("파워순 ------------>");		
		list.forEach(new ConsumerImp());
		 
	}

}
