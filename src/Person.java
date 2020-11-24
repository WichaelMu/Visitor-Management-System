import java.util.ArrayList;

public class Person {
	private String name;
	public static ArrayList<Person> People = new ArrayList<Person>();

	public Person(String name){
		People.add(this);
		this.name = name;
	}

	public String name(){
		return this.name;
	}
}
