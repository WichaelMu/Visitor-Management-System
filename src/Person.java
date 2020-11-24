import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Person{
	/** The list of every person.
	 */
	public static ArrayList<Person> People = new ArrayList<Person>();
	static int _ID = 0;
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

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

	/** The time this person checked in.
	 */
	private LocalDateTime TimeIn;
	private ArrayList<LocalDateTime> CheckedInTimes = new ArrayList<LocalDateTime>();
	private ArrayList<LocalDateTime> CheckedOutTimes = new ArrayList<LocalDateTime>();

	public Person(String F_name, String S_name, String Suburb, String PhoneN){
		ID = ++_ID;
		People.add(this);

		this.F_name = F_name;
		this.S_name = S_name;
		this.Suburb = Suburb;
		this.PhoneN = PhoneN;

		TimeIn = LocalDateTime.now();
		CheckedInTimes.add(TimeIn);
	}

	/**@return The first and last name of this person.*/

	public String name(){
		return this.F_name + " " + this.S_name;
	}

	public void CheckOut(){
		CheckedOutTimes.add(LocalDateTime.now());
	}

	public String toString(){
		return ID + ": " + name() + "\nPhone No.: " + this.PhoneN + "\nSuburb: " + this.Suburb;
	}
}
