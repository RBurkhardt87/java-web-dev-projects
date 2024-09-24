package studio;

import java.util.ArrayList;

public class TrueFalse extends Question{
    public TrueFalse(int index, String query, ArrayList<String> choices, ArrayList<String> correctAnswer) {
        super(index, query, choices, correctAnswer);
    }

    @Override
    public boolean isCorrect(String answer) {
        return false;
    }
}
