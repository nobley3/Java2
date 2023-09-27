package java2prj1.lamda;

import java.util.function.Consumer;

/*
interface Consumer<T>{
		void accept(T t);
}
*/
public class ConsumerTest {

	public static void main(String[] args) {
//		
		Consumer<String> c = str -> System.out.println("진짜" + str);
		c.accept("람다좋아요");
//		
		Consumer<String> c2 = new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println(t + "진짜진짜 편하네");

			}
		};
		c2.accept("람다식은");
		
//			
		class B implements Consumer<String> {

			@Override
			public void accept(String t) {
				System.out.println(t+"함수형 인터페이스인 경우만 가능해요");
			}
		}
		B b = new B();
		b.accept("람다식은=>");
		
//		
		Consumer<Integer> c3 = su -> {
			
			int sum =0;
			for(int i=1;i<=su;i++) {
				sum+=i;
			}
			System.out.println("1~"+su+"까지의 합 ="+sum);
		};
		c3.accept(5); //5를 su가 받는다. 
	}

}
