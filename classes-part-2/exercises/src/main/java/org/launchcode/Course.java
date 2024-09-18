package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString(){
        return "The enrolledStudents for this course are " + enrolledStudents + ". The course instructor will be : " +
                instructor + " and they will cover " + topic + ".";

    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object toBeCompared){

        if(toBeCompared == this){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if(toBeCompared.getClass() != getClass()){
            return false;
        }
        Course theCourse = (Course) toBeCompared;
        return theCourse.getInstructor() == getInstructor();
    }


}


