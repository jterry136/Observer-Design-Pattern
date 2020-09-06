/**
 * The Cartel class is a class that implements the Observer interface. 
 * It implements the methods update() and getLog().
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public class Cartel implements Observer {
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * A parameterized constructor that creates a new instance of the Cartel class.
	 * The constructor initializes values for instance variables cook and sightings, and then calls the Cook's
	 * registerObserver() method to register itself
	 * @param cook The cook parameter is a Cook object. This Cook object represents the Subject the Cartel are following
	 */
	public Cartel(Subject cook) {
			this.cook = cook;
			sightings = new ArrayList<Sighting>();
			this.cook.registerObserver(this);
		}
	
	/**
	 * The update() method constructs a new Sighting object from the provided parameters, and then adds that to sightings, the list of
	 * Sighting objects held by the Cartel.
	 * @param location: A String representing the location of the sighting
	 * @param description: A String representing the description of what happened at the sighting
	 */
	public void update(String location, String description) {
			Sighting sighting = new Sighting(location, description);
			sightings.add(sighting);
		}
	
	/**
	 * The getLog method returns a String object that displays the data from 
	 * sightings in a readable format
	 * @return String: This String will be displayed to show the data the Cartel has gathered
	 */
	public String getLog() {
			String log = "";
			for(Sighting sighting : sightings) {
				log = log + sighting.getLocation() + " ("+sighting.getDetails() + ")\n";
			}
			return log;
		}

}
