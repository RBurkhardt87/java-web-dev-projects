package studio;

import java.util.ArrayList;


public class MultipleChoice extends Question {



    //TODO: CONSTRUCTOR (WILL SUPER/EXTEND QUESTION)
    public MultipleChoice(int index, String query, ArrayList<String> choices, ArrayList<String> correctAnswer) {
        super(index, query, choices, correctAnswer);
    }



    //TODO: isCorrect() WILL CHECK IF THE ANSWER IS CORRECT
    //Through validation, we will compare the correct answer with the user's answer and
    //return true or false.
    @Override
    public boolean isCorrect(String answer) {

        return true;
    }


}