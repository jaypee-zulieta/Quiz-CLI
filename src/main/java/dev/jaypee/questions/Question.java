package dev.jaypee.questions;

import java.util.List;

public abstract class Question {

    protected final String question;
    protected final List<String> answers;

    public Question(String question, List<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public List<String> getAnswers() {
        return this.answers;
    }

    public abstract String getQuestion();

    public abstract boolean checkAnswer(String answer);
}
