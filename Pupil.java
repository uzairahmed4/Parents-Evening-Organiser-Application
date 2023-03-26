/**
 * This class represents a pupil at the school.
 */
public class Pupil extends Person {

	/**
	 * This represents the parent or guardian of a pupil who is the primary contact with the school. It is expected that this person will keep other parents or guardians informed, and that they will attend the parents evening together if both (or all) wish to attend. This reflects how schools generally operate when parents are separated or divorced.
	 */
	private Person contactParent;
	/**
	 * The teachers who teach this pupil.
	 */
	private Teacher[] taughtBy;

}