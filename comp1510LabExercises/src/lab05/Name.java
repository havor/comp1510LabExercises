package lab05;
/**
 * A class stores a person's first name, middle name and last name.
 * @author Hai Hua, Tan
 * @version 1.0
 * */
public class Name {
    /**
     * firstName stores a string of first name of a person.
     * */
    private String firstName;
    
    /**
     * middleName stores a string of middle name of a person.
     * */
    private String middleName;
    /**
     * lastName stores a string of last name of a person.
     * */
    private String lastName;
    
    /**
     * Constructor of class "Name", using parameters of first name,
     * middle name and last name.
     * @param firstName is the first name of a person
     * @param middleName is the first name of a person
     * @param lastName is the first name of a person
     * */
    Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    /**
     * getter of firstName.
     * @return value of  firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter of middleName.
     * @return value of middleName
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * getter of lastName.
     * @return value of lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Get the full name with "fisrtName middleName lastName" format.
     * @return full name with "firstName middleName lastName" format
     */
    public String getFirstMiddleLast() {
        String fullName = getFirstName() + " "
                        + getMiddleName() + " "
                        + getLastName();
        return fullName;
    }
    
    /**
     * Get the full name with "lastName middleName firstName" format.
     * @return full name with "lastName middleName firstName" format
     */
    public String getLastFirstMiddle() {
        String fullName = getLastName() + ", "
                        + getFirstName() + " "
                        + getMiddleName();
        return fullName;
    }
    
    /**
     * Compare two names to determine whether they are equal. They are equal
     * if their first name, middle name and last name are all equal regardless
     * of case.
     * @param otherName is the other Name object to be compared
     * @return true if two names are equal.
     * */
    public boolean equals(Name otherName) {
        String otherFirstName = otherName.getFirstName();
        String otherMiddleName = otherName.getMiddleName();
        String otherlastName = otherName.getLastName();
        
        return getFirstName().equalsIgnoreCase(otherFirstName)
         && getMiddleName().equalsIgnoreCase(otherMiddleName) 
         && getLastName().equalsIgnoreCase(otherlastName);
    }
    
    @Override
    public int hashCode() {
       return super.hashCode();
    }
    
    /**
     * Method to get initials of a name.
     * @return the initials of the name.
     */
    public String getInitials() {
        return (getFirstName().substring(0, 1)
                + getMiddleName().substring(0, 1)
                + getLastName().substring(0, 1)).toUpperCase();
    }
    
    /**
     * Method to get the length of the name.
     * @return integer value of the length of the name 
     */
    public int length() {
        return getFirstName().length()
              + getMiddleName().length()
              + getLastName().length();
    }
}
