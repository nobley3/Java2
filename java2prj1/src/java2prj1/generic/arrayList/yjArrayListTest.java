package java2prj1.generic.arrayList;

public class yjArrayListTest {

	public static void main(String[] args) {
		yjArrayList list = new yjArrayList();
		list.add("one");
		list.add("one2");
		list.add("one3");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.forEach(new MyConsumer() {

			@Override
			public void accept(Object o) {
				System.out.println("hi forEach" + o);

			}});
	}

}
