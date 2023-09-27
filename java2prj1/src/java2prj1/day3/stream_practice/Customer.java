package java2prj1.day3.stream_practice;

public class Customer {
// id, name, grade , point grade
	
	String id;
	String name;
	int point;
	String grade;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Customer(String id, String name, int point, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", point=" + point + ", grade=" + grade + "]";
	}
	
	
	 
	
	
}
