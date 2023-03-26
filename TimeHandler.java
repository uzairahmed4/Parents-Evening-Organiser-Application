/**
 * This class monitors the current time and checks when significant times have been reached, triggering updates in the PEO system.
 * 
 * The TimeHandler can be implemented as an Observer, observing the SystemTimer. When it is notified of a change in the time, its update operation will check if a significant time has been passed and update the PEO system or the meeting rooms accordingly. It implements the behaviour shown in the System Timer use case.
 */
public class TimeHandler {

	/**
	 * a reference to the System Timer, used to observe updates to the current time.
	 */
	private SystemTimer timer;
	/**
	 * The Time Handler will send messages to the central PEO system to trigger time-bound operations, for example, opening bookings when the time specified for this is reached.
	 */
	private PEOSystemDatabase thePEOSystem;

	/**
	 * This operation will check whether the current time has reached or passed an important milestone in the life of the system, and will trigger changes in the system status and call other system operations as needed.
	 * 
	 * Update system status
	 */
	public void triggerSystemUpdates() {
		// TODO - implement TimeHandler.triggerSystemUpdates
		throw new UnsupportedOperationException();
	}

	/**
	 * If the time allowed for the current meeting slot has ended, the current meeting slot will be updated in the system and in the meeting rooms, parents will be moved out of the meetings that have ended, and new parents will be moved into the meeting rooms from the lobby if it is now their time slot.Start and end meetings
	 */
	public void triggerMeetingRoomUpdates() {
		// TODO - implement TimeHandler.triggerMeetingRoomUpdates
		throw new UnsupportedOperationException();
	}

}