package java2prj1.generic.practice;

public class ToyBoxTest {

	public static void main(String[] args) {
	
		ToyBox<Toy> list = new ToyBox<>();
		list.add(new Toy("콩순이","25,000"));;
		list.add(new Toy("비행기","32,000"));
		list.add(new Toy("또봇","18,000"));
		
		for(int i=0;i<list.size();i++) {
			Toy t = list.get(i);
			System.out.println(t);
			//System.out.println(t.getName());
		}

	}

}
