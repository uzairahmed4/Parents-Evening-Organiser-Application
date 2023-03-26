/**
 * This class represents a teacher at the school.
 */
public class Teacher extends Person {

	/**
	 * The subject taught by this teacher. This will be shown to parents when they are booking or viewing appointments.
	 */
	private string subject;
	/**
	 * When a teacher is added to the system, a meeting room is created for them and the schedule is set up with all available start times within the period specified for the parents evening.
	 */
	private MeetingRoom myMeetingRoom;

}