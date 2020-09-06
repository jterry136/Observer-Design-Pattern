/**
 * This interface describes what a Subject class should do. It forces any class that implements this interface
 * to implement the methods registerObserver, removeObserver, and notifyObservers.
 * @author Jonathan Terry
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String location, String description);

}
