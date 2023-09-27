package Bi_practice;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bi_practice {

	public static void main(String[] args) {
	 
//		
		BiConsumer<Integer,Integer> add = (a,b) -> System.out.println("포카리의가격은=>"+a+"게토레이의가격은=>"+b);
		add.accept(2200, 1300);
		
//		
		BiFunction<Integer, Integer, String> func = (x,y) -> Integer.toString(x*y);
		String result = func.apply(20, 5);
		System.out.println(result); //100
		
		
//		
		BiPredicate<String, Integer> check = (a,b) -> {
			return a.length()==b;
		};
		
		boolean result2 = check.test("불닭볶음면", 5);
		System.out.println(result2); //true;
		
		boolean result3 = check.test("신라면", 5);
		System.out.println(result3); //false;
		
 
	}

}
