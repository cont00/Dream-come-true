import java.util.ArrayList;
import java.util.List;

class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name = " + name + ", age = " + age + "]";
	}
	
}
public class Ex03 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person ("ABC", 30));
		list.add(new Person ("DEF", 33));
		list.add(new Person ("GHI", 36));
		
		for (Person p : list) {
			System.out.println(p);
		}
	}
}
