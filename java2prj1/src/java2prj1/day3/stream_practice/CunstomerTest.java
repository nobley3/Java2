package java2prj1.day3.stream_practice;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CunstomerTest {

	public static void main(String[] args) {
	 

		ArrayList<Customer> c = new ArrayList<>();
		c.add(new Customer("A001","서예진",500,"vvip"));
		c.add(new Customer("A002","김병진",320,"vip"));
		c.add(new Customer("A003","표준태",480,"vvip"));
		c.add(new Customer("A004","허재혁",360,"vip"));
		c.add(new Customer("A005","김민규",290,"bronze"));
		c.add(new Customer("A006","곽단야",260,"bronze"));
		c.add(new Customer("A007","김재열",180,"bronze"));
		c.add(new Customer("A008","이정훈",150,"bronze"));
		c.add(new Customer("A009","김현수",420,"vvip"));
		c.add(new Customer("A010","박태민",370,"vip"));
		
//		1. 고객등급이 vvip  사람이 몇명인지 
		System.out.println("vvip 몇명인가요===>");
		Stream<Customer> stream = c.stream();
		long count = stream.filter(customer->customer.getGrade().equals("vvip")).count();
		System.out.println("vvip등급은 : "+count+"명");
		
//		2. 고객등급이 vip사람만 출력
		System.out.println("vip 누구인가요===>");
		stream = c.stream();
		stream.filter(customer->customer.getGrade().equals("vip")).forEach(customer->System.out.println("ID:"+customer.getId()+" "+"이름:"+customer.getName()+" "+"등급:"+customer.getGrade()));
		
//		3. 포인트가 높은 사람순으로 정렬해서 출력
		System.out.println("포인트 높은사람 순으로===>");
		stream = c.stream();
		stream.sorted((a,b)->b.getPoint()-a.getPoint()).forEach(customer->System.out.println("ID:"+customer.getId()+" "+"이름:"+customer.getName()+" "+"포인트:"+customer.getPoint()));
		
		
	}

}
