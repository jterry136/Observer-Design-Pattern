/**
 * The Sighting class represents when the Cartel spots the Cook. It contains a String location which describes where the Cook was
 * sighted, and a String description which describes what the Cook was doing when they were sighted
 * @author Jonathan Terry
 *
 */
public class Sighting {

	private String location;
	private String details;
	
	/**
	 * A parameterized constructor that creates a new instance of the Sighting class. It initializes the instance variables
	 * location and details
	 * @param location: A String describing where the Cook was sited
	 * @param details: A String describing what happened when the Cook was sighted
	 */
	public Sighting(String location, String details) {
			this.location = location;
			this.details = details;
		}
	
	/**
	 * A getter method
	 * @return the value of this Sighting's location variable
	 */
	public String getLocation() {
			return this.location;
		}
	
	/**
	 * A getter method
	 * @return the value of this Sighting's details variable
	 */
	public String getDetails() {
			return this.details;
		}
}
