import java.util.ArrayList;

public class Person {
	static int _ID = 0;
	/** The list of every person.
	 */
	public static ArrayList<Person> People = new ArrayList<Person>();

	/** The unique ID of this person.
	 */
	public int ID;

	/** The first name of this person.
	 */
	private String F_name;
	/** The surname of this person.
	 */
	private String S_name;
	/** The suburb of this person.
	 */
	private String Suburb;
	/** The phone number of this person.
	 */
	private String PhoneN;

	public Person(String F_name, String S_name, String Suburb, String PhoneN){
		ID = ++_ID;
		People.add(this);

		this.F_name = F_name;
		this.S_name = S_name;
		this.Suburb = Suburb;
		this.PhoneN = PhoneN;

	}

	/**@return The first and last name of this person.*/

	public String name(){
		return this.F_name + " " + this.S_name;
	}

	public String toString(){
		return ID + ": " + name() + "\nPhone No.: " + this.PhoneN + "\nSuburb: " + this.Suburb;
	}

}
