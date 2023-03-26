/**
 * A time slot during the parent's evening when a meeting may take place.
 */
public class Timeslot {

	private DateAndTime startTime;
	private boolean teacherAvailable;
	/**
	 * This is the pupil whose parent has made an appointment to see the teacher at this time.
	 */
	private Pupil bookedFor;
	/**
	 * The system will create a log entry after the meeting ends or the appointment time is over, indicating whether or not the parent attended the meeting.
	 */
	private string meetingLogEntry;

}