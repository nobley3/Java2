package java2prj1.generic.practice;

public class Menu extends Food{

	String menu = "봉골레 파스타";

	@Override
	public String toString() {
		return "Menu [menu=" + menu + "]";
	}
	
	
 
}

class Menu2 extends Food{
	
	String menu = "명란오일 파스타";

	@Override
	public String toString() {
		return "Menu2 [menu=" + menu + "]";
	}
	
	
}

class Menu3 extends Food{
	String menu = "로제파스타";

	@Override
	public String toString() {
		return "Menu3 [menu=" + menu + "]";
	}
	
	
}



