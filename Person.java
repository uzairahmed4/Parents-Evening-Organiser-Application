/**
 * This class represents a person in general.
 */
public class Person {

	/**
	 * For simplicity we assume that name is a unique identifier for a person. In the real system, this may instead be implemented by something else such as an email address.
	 */
	private String name;
        
        private String emailId;
        
        private int contactNumber;
        
//        public Person (String N) {
//            this.name = N;
//        }
        
        // Getter
        public String getName() {
        return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
        
//        // Getter
//        public String getEmailId() {
//        return emailId;
//        }
//
//        // Setter
//        public void setEmailId(String newEmailId) {
//            this.emailId = newEmailId;
//        }
//        
//        // Getter
//        public int getContactNumber() {
//            return contactNumber;
//        }
//
//        // Setter
//        public void setContactNumber(int newContactNumber) {
//            this.contactNumber = newContactNumber;
//        }

}
