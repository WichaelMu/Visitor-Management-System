import java.util.ArrayList;

public class Person {
	static int _ID = 0;
	public int ID;
	private String name;
	public static ArrayList<Person> People = new ArrayList<Person>();

	public Person(String name){
		ID = ++_ID;
		People.add(this);
		this.name = name;
	}

	public String name(){
		return this.name;
	}

	public String toString(){
		return this.name + " " + ID;
	}
}
