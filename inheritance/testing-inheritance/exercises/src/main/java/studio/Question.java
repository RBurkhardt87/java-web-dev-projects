package studio;


import java.util.ArrayList;


public abstract class Question {



    //TODO: DECLARE FIELDS/PROPS
    private int index;

    private final String query;         //we want the question to be final

    //we were putting choices in an ArrayList, but Carrie used a HashMap to link a letter with a choice String. This makes
    //sense to me. Makes validation seem smoother.
    private ArrayList<String> choices;


    private ArrayList<String> correctAnswer;



    //TODO: CONSTRUCTOR
    public Question(int index, String query, ArrayList<String> choices, ArrayList<String> correctAnswer) {
        this.index = index;
        this.query = query;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }



    //TODO: GETTERS/SETTERS
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getQuery() {
        return query;
    }


    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public ArrayList<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(ArrayList<String> correctAnswer) {
        this.correctAnswer = correctAnswer;
    }





    //TODO: DECLARE/IMPLEMENT A METHOD TO ASK QUESTION AND DISPLAY ANSWER CHOICES
    //This is work the same for every type of question we currently have
    public void askQuestion() {
        //query
        System.out.println(this.getQuery());

        //choices
        for(String choice : this.getChoices()){
            System.out.println(choice);

        }

    }


    //TODO: METHOD CHECKS IF INPUT IS VALID AT ALL
    //This is kind of sticky because user is returning a string response of answers to us rather than a number/letter
    //This should search through the ArrayList choices and look for the users response (case-insensitive)
    //If the users response is at least one of the choices, it will return true and be valid input
    //If not one of the choices is equal, then user response is invalid
    //If it is invalid ---> There should be away to inform the user and let them try again

    public boolean isCorrect(String response) {
        for (String choice : this.getChoices()) {
            return choice.equalsIgnoreCase(response);
        }
        return false;
    }


}