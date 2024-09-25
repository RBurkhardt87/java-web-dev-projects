package studio;


import java.util.ArrayList;


public abstract class Question {



    //TODO: DECLARE FIELDS/PROPS
    private int index;

    private final String query;         //we want the question to be final

    //we were putting choices in an ArrayList, but Carrie used a HashMap to link a letter with a choice String. This makes
    //sense to me. Makes validation seem smoother.
    private ArrayList<String> choices;

    //However, I was thinking that the question and choices could be in a hashmap. Where the questions were the keys and the
    //choices were the values. The one thing is, you cant use a Collections shuffle or addAll with a Hashmap (only hashSet)
    //and you would have to make a hashmap with questions as keys and I would probably still want choices to be a hashmap, so
    //the values would be of hashmaps. That seems complicated.... would it be like this...

    //Hashmap<String, HashMap<Integer, String> questionsWithChoices = new HashMap<>();   Outer HashMap holds questions as the keys
    //and the innerHashMap of numbers : choices is the value

    /*

    String question1 = "What color is the Ocean?"

    HashMap<Integer, String> choices1 = new HashMap<>();
    choices1.put("1", "Purple");
    choices1.put("2", "Orange");
    choices1.put("3", "Blue");
    choices1.put("4", "Pink");

    So, now the inner HashMap (choices1) is populated with HashMap objects that match a value with an integer key
    I believe that I can then put the hashmap as the value to the question key inside the outer HashMap.

    questionsWithChoices.put(question1 , choices1);


    If that works, then great! It is hard coded more than I would like (couldn't randomize the choices for questions this way),
    but I am sure that I could just create a for loop to assign integers to choice options inside the inner HashMap.
    For the outer HashMap, I would populate it probably has I have instantiating the questions.
    and match the key/value pairs randomly (kind of like how Carrie did the ArrayList of choices)

    But, we also want to make sure that we have a way to determine the correct answer. Carrie determined hers in a constructor
    for choices objects. I like that idea, but what is another way we could decide. Hmmm....

    With each instantiation of question and hashmap of choices, we could also have as parameter for the correct answer. We could
    use a variable to store it and for validation later on. We would just want to look at the values of the inner HashMap

     */


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