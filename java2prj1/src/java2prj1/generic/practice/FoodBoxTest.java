package java2prj1.generic.practice;

public class FoodBoxTest {

	public static void main(String[] args) {
		
		FoodBox<Menu> f = new FoodBox();
		f.add(new Menu());
		Menu result = f.get(0);
		System.out.println(result);
		
		FoodBox<Menu2> m2 = new FoodBox();
		m2.add(new Menu2());
		m2.add(new Menu2());
		Menu2 result2 = m2.get(0);
		System.out.println(result2);
	//	FoodBox<Toy> t = new FoodBox();
		
		
		ToyBox<Toy>  d= new ToyBox<>();
		ToyBox<Food>  a= new ToyBox<>();
		
		
		
	}

}
