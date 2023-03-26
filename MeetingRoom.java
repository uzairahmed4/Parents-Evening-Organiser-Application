/**
 * This class represents a teacher's online meeting room. Each teacher has exactly one meeting room. The meeting room holds the schedule of the appointments made with the teacher. The meeting room is open when the teacher opens it during the parents' evening, and is otherwise closed.
 * 
 * It may be appropriate to implement this class as an Observable. It will be observed from within the ParentScreen and TeacherScreen. The teacher will observe only their own meeting room. Parents will observe different teachers' meeting rooms as they join and leave meetings with different teachers. A parent can only join or be in the lobby of one teacher's meeting room at any point in time.
 */
public class MeetingRoom {

	/**
	 * It will probably be useful for a meeting room to record which teacher it belongs to. You will need to ensure that the mutual references between a Teacher and their MeetingRoom are set up correctly.
	 */
	private Teacher owner;
	/**
	 * The list of time slots during the parents evening, recording appointments made by parents to meet the teacher.
	 */
	private Timeslot[] schedule;
	/**
	 * Represents whether the meeting room is currently open.
	 */
	private boolean isOpen;
	/**
	 * Represents whether the parent who has the current appointment has joined the meeting room. The parent's name may be displayed in some way on the teacher's screen to indicate that the parent is in the meeting room.
	 */
	private boolean parentPresent;
	/**
	 * Parents who have appointments either at present or in the future and are waiting to see the teacher. A parent can only be in one teacher's lobby or meeting room at a time. This is a list of pupils because parents are not represented directly in the system but are associated with their children.
	 */
	private Pupil[] parentsWaitingInLobby;
	/**
	 * This is the index of the current meeting times slot in the schedule. It is used to determine whether a parent who tries to join the meeting is admitted now, made to wait in the lobby (because they have an appointment in the future), or refused entry. It is updated whenever the TimeHandler sends allChange messages to all the teachers' meeting rooms.
	 */
	private int currentMeetingTimeSlot;

	/**
	 * Teacher opens the meeting room at the start of the parents' evening.
	 */
	public void open() {
		// TODO - implement MeetingRoom.open
		throw new UnsupportedOperationException();
	}

	/**
	 * Teacher closes the meeting room.
	 */
	public void close() {
		// TODO - implement MeetingRoom.close
		throw new UnsupportedOperationException();
	}

	/**
	 * A parent attempts to join the meeting room. If the meeting room is open and the parent has an appointment at the current time, then the parent is allowed in to meet the teacher. If the meeting room is closed or the parent's appointment in the future, the parent is placed in the lobby. If the parent does not have an appointment or their appointment was in the past, they are refused entry to the meeting room.
	 */
	public void join() {
		// TODO - implement MeetingRoom.join
		throw new UnsupportedOperationException();
	}

	/**
	 * A parent who is currently in the meeting room leaves the meeting.
	 */
	public void leave() {
		// TODO - implement MeetingRoom.leave
		throw new UnsupportedOperationException();
	}

	/**
	 * This operation is triggered when it is time to end a meeting and start the next one. Any parent currently in the meeting room is removed. If there is a parent in the lobby who has a meeting booked at the current time, they are moved from the lobby into the meeting with the teacher.
	 */
	public void allChange() {
		// TODO - implement MeetingRoom.allChange
		throw new UnsupportedOperationException();
	}

	/**
	 * This operation makes an appointment for a parent to meet a teacher during a time slot when that teacher is available. There may be many other operations to support viewing and changing appointments.
	 */
	public void makeAppointment() {
		// TODO - implement MeetingRoom.makeAppointment
		throw new UnsupportedOperationException();
	}

}