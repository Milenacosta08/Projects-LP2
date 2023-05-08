package BridgePattern;

public class bridgePatternDemo {
    public static void main(String[] args) {
        questionFormat questions = new questionFormat("Java Programming Language");
        questions.q = new javaQuestions();
        questions.delete("what is class?");
        questions.display();
        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }
}