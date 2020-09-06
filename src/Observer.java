/**
 * This interface describes what an Observer class should do. It forces any class that implements this interface
 * to implement the methods update() and getLog()
 * @author Jonathan Terry
 *
 */
public interface Observer {
	public void update(String location, String description);
	public String getLog();

}
