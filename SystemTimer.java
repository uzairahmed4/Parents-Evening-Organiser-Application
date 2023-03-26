/**
 * The System Timer records the current date and time. In the real system this class might be implemented using an appropriate Java class, such as Timer, which will find out the time from the system clock. In the group project, date and time will be represented simply using the DateAndTime class, and the timer will be provided with an interface with buttons to use to simulate the passage of time, e.g., setting the current day and time, or going forward in time by a desired increment.
 * 
 * This class can be implemented in Java as a subclass of Observable. It will be observed by the TimeHandler.
 * 
 * There should be only one instance of this class.
 */
public class SystemTimer {

	/**
	 * The current date and time.
	 */
	private DateAndTime now;

}