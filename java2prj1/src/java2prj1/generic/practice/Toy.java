package java2prj1.generic.practice;

public class Toy {

	String name;
	String price;
	
	public Toy() {
		// TODO Auto-generated constructor stub
	}

	public Toy(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", price=" + price + "]";
	}
	
	
}
