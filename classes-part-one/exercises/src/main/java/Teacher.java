

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;


//Add Getter and Setters-- remember to put the getter and setters inside the class so it has access to the private fields


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }
}

