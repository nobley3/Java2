package java2prj1.day3.collection;

import java.util.Scanner;

public class SimplePro2 {
//	의존성 dependency
	private CalculatorI cal;
//	dependency Injection
	public void setCal(CalculatorI cal) {
		this.cal = cal;
	}

	public void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 프로그램 입니다.");

		System.out.println("첫번째 수");
		int su = sc.nextInt();

		System.out.println("두번째 수");
		int s2 = sc.nextInt();

		int result = cal.add(su, s2);
		System.out.println(result);
	}

	public static void main(String[] args) {

		SimplePro2 p = new SimplePro2();
		p.setCal(new LGCalculator());
		p.run();
	}

}
