

public class Student {

        //You declare your fields at the top of you class:
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;


        //You have to set up a constructor to pass in argument/values for new instances. Since we are
        //in the Student Class we can use 'this' refers to current instance of class

        public Student(String name, int studentId, int numberOfCredits, double gpa){
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }



        // Drop your getters and setters below for the Student class.
        //You set up your getter and setter methods after you declare the fields

        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        private void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }



        // To instantiate the Student class, add your code to the main in the file, StudentPractice.

        //Create an addGrade method

        public void addGrade(int courseCredits, double grade) {
                // Update the appropriate fields: numberOfCredits, gpa
                double totalQualityScore = this.gpa * this.numberOfCredits;
                totalQualityScore += courseCredits * grade;
                this.numberOfCredits += courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }


        //Create getGradeLevel
        public String getGradeLevel(int credits) {
                // Determine the grade level of the student based on numberOfCredits

                if (credits <= 29){
                        return "freshman";
                } else if (credits <=59){
                        return "sophomore";
                } else if (credits <=89) {
                        return "junior";
                } else return "senior";
        }

}
