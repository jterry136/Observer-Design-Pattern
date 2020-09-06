/**
 * The Cook class is a class that implements the Subject interface. 
 * It implements the methods registerObserver, removeObserver, and notifyObserver
 * as it is forced to do by Subject
 * @author Jonathan Terry
 *
 */

import java.util.ArrayList;

public class Cook implements Subject {
	private ArrayList<Observer> observers;
	private String name;

	/**
	 * A parameterized constructor that creates an instance of the Cook class. The constructor
	 * initializes values for instance variables name and observers.
	 * @param name
	 */
	public Cook(String name) {
			this.name = name;
			this.observers = new ArrayList<Observer>();
		}
	
	/**
	 * This method adds an Observer object to the list of Observers held by the Cook class
	 * @param observer: The Observer object to be added to observers
	 */
	public void registerObserver(Observer observer) {
			observers.add(observer);
		}
	
	/**
	 * This method removes an observer from the list of Observers held by the Cook class
	 * @param observer: The Observer object to be removed from observers
	 */
	public void removeObserver(Observer observer) {
			observers.remove(observer);
		}
		
	/**
	 * This method adds data from a sighting to each Observer object held by Cook in observers
	 * @param location: A String representing the location of the sighting
	 * @param description: A String representing the description of what happened at the sighting
	 */
	public void notifyObservers(String location, String description) {
			for(Observer observer : observers) {
				observer.update(location, description);
			}
		}
	
	/**
	 * This method calls notifyObservers, passing in the provided location and description parameters
	 * @param location: A String representing the location of the sighting
	 * @param description: A String representing the description of what happened at the sighting
	 */
	public void enterSighting(String location, String description) {
			notifyObservers(location, description);
		}
	
	/**
	 * A getter method
	 * @return A String representing the name of the Cook
	 */
	public String getName() {
			return this.name;
		}
}
