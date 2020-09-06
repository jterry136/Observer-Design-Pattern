/**
 * The DEA class is a class that implements the Observer interface. 
 * It implements the methods update() and getLog().
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public class DEA implements Observer {
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;

	/**
	 * A parameterized constructor that creates a new instance of the DEA class. This constructor
	 * initializes values for instance variables cook, locations, and notes, and then calls
	 * the Cook's registerObserver() method to register itself
	 * @param cook: The cook parameter is a Cook object. This Cook object represents the Subject the DEA are following
	 */
	public DEA(Subject cook) {
			this.cook = cook;
			locations = new ArrayList<String>();
			notes = "\nNotes:\n";
			cook.registerObserver(this);
		}	
	
	/**
	 * This method adds location to the list of locations held by the DEA. It also adds 
	 * description to a list of notes held by the DEA
	 * @param location: A String representing the location of the sighting
	 * @param description: A String representing the description of what happened at the sighting
	 */
	public void update(String location, String description) {
			locations.add(location);
			notes = notes+description + "\n";
		}
	
	/**
	 * The getLog method returns a String object that displays the data from 
	 * sightings in a readable format unique to the DEA. It's important to note
	 * that this getLog() method produces the same data passed to Cartel, but in a different formats
	 * @return String: This String will be displayed to show the data the DEA has gathered
	 */
	public String getLog() {
			String log = "Locations: \n";
			for(String location : locations) {
				log = log + location + "\n";
			}
			log = log + notes;
			return log;
		}
}
