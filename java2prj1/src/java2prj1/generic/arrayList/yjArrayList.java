package java2prj1.generic.arrayList;

public class yjArrayList {

	private Object[]nums;
	private int current;
	
	public yjArrayList() {
		nums = new Object[5];
		current = 0;
	}
	
	public void add(Object obj) {
		nums[current]=obj;
		current++;
	}
	
	public Object get(int i) {
		return nums[i];
	} 
	
	public int size() {
		return current;
	}
	
	public void clear() {
		current = 0;
	}
	
	public void forEach(MyConsumer c) {
		for(int i=0;i<current;i++) {
			c.accept(get(i));
		}
	}
}
