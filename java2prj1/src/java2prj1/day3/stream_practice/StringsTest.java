package java2prj1.day3.stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringsTest {

//	Q.stream으로 다루기 
	public static void main(String[] args) {
	
		String[] food = {"마라탕","치킨","피자","파스타"};
 
//		String 
		System.out.println("foodList==>");
		Stream<String> str = Arrays.stream(food);
		str.sorted().forEach(s->System.out.println(s));

//		ArrayList
		ArrayList<String> acorn = new ArrayList<>();
		acorn.add("서예진");
		acorn.add("문나정");
		acorn.add("이윤정");
		acorn.add("이윤");
		
		System.out.println("acornList==>");
		Stream<String> str2 = acorn.stream();
		str2.sorted().forEach(s->System.out.println(s));
		
		
//		int
		int[] ages = {29,28,27,30};
		
		System.out.println("ageList==>");
		IntStream str3 = Arrays.stream(ages);
		System.out.println("평균나이는"+str3.average().getAsDouble()+"세");
		
	}

}
