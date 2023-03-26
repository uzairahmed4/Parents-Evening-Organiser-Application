/**
 * This class holds the core data and provides the core functionality of the PEO system. Several of the required attributes and operations are indicated but you will probably need to add many more.
 */
public class PEOSystemDatabase {

	/**
	 * Represents the current status of the PEO system, which may be Dormant, PreparingForBooking, BookingAppointments, BookingsEnded, and ParentsEveningOn. These are represented in the design as integers but may be implemented in any appropriate way.
	 */
	private int systemStatus;
	/**
	 * The date and time from which the system allows parents to book appointments.
	 */
	private DateAndTime bookingsOpenTime;
	/**
	 * The date and time when the system stops allowing parents to make appointments. Expected to be after bookingsOpenTime and before parentsEveningStartTime.
	 */
	private DateAndTime bookingsCloseTime;
	/**
	 * The date and time when the parents evening starts. Expected to be after bookingsCloseTime and before parentsEveningEndTime but on the same day.
	 */
	private DateAndTime parentsEveningStartTime;
	/**
	 * The date and time when the parents' evening ends. This is expected to be later on the same day as ParentsEveningStartTime.
	 */
	private DateAndTime parentsEveningEndTime;
	/**
	 * The duration in minutes of a meeting between a teacher and a parent/guardian. Usually about 5 to 10 minutes. This will be used to calculate the number of time slots available for meetings during the parents evening, and the start time of each time slot.
	 */
	private int meetingLength;
	/**
	 * The list of teachers at the school.
	 */
	private Teacher[] staffList;
	/**
	 * Details of pupils at the school.
	 */
	private Pupil[] schoolRoll;
	/**
	 * The record of notification sent by the system to parents and teachers.
	 */
	private Notification[] notifications;
	/**
	 * This represent the index of the current time slot in the schedules of the teachers' meeting rooms. It is set as 0 when the parents evening begins and is updated whenever the TimeHandler is notified that time has passed during the parents evening. It is used to trigger the start and end of meetings.
	 */
	private int currentMeetingTimeSlot;

	/**
	 * The administrator uses this operation to clear old notifications when the system is going to be set up for a new parents evening.
	 */
	public void clearNotifications() {
		// TODO - implement PEOSystemDatabase.clearNotifications
		throw new UnsupportedOperationException();
	}

	/**
	 * The administrator uses this operation to add the details of a pupil to the system. You will need to add other operations to remove and edit pupils.
	 */
	public void addPupil() {
		// TODO - implement PEOSystemDatabase.addPupil
		throw new UnsupportedOperationException();
	}

	/**
	 * The administrator uses this operation to add a teacher to the system. There will be other operations to remove and edit teachers.
	 */
	public void addTeacher() {
		// TODO - implement PEOSystemDatabase.addTeacher
		throw new UnsupportedOperationException();
	}

	/**
	 * Create and send a notification to a parent or a teacher.
	 */
	public void sendNotification() {
		// TODO - implement PEOSystemDatabase.sendNotification
		throw new UnsupportedOperationException();
	}

	/**
	 * The administrator uses this operation to see the log of meetings that have taken place. This could represent a group of operations to allow the log to be viewed in different way.
	 */
	public void viewMeetingLog() {
		// TODO - implement PEOSystemDatabase.viewMeetingLog
		throw new UnsupportedOperationException();
	}

	/**
	 * Parents and teachers can use this operation to read notifications sent to them by the system.
	 */
	public void viewNotifications() {
		// TODO - implement PEOSystemDatabase.viewNotifications
		throw new UnsupportedOperationException();
	}

	/**
	 * This may represent a group of operations used by parents to make appointments to meet their child's teachers. The parent can choose to choose appointment times manually or to allow the system to select appointment times.
	 */
	public void bookAppointments() {
		// TODO - implement PEOSystemDatabase.bookAppointments
		throw new UnsupportedOperationException();
	}

	/**
	 * This may represent a group of operations used by teachers to edit their availability for the timeslots during the parents evening.
	 */
	public void setAvailability() {
		// TODO - implement PEOSystemDatabase.setAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * Called by the TimeHandler when it detects that BookingsOpenTime has been reached. The system state is changed to bookingsOpen and notifications are sent to parents asking them to book appointments to meet their children's teachers. There will be other operations like this to handle other time-triggered changes in the system.
	 */
	public void openBookings() {
		// TODO - implement PEOSystemDatabase.openBookings
		throw new UnsupportedOperationException();
	}

}