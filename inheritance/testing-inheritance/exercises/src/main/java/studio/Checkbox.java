package studio;

import java.util.ArrayList;

public class Checkbox extends Question {
    public Checkbox(int index, String query, ArrayList<String> choices, ArrayList<String> correctAnswer) {
        super(index, query, choices, correctAnswer);
    }

    @Override
    public boolean isCorrect(String answer) {
        return false;
    }
}
