package dev.jaypee.questions;

import java.util.List;

public class IdentificationQuestion extends Question {

    public IdentificationQuestion(String question, List<String> answers) {
        super(question, answers);
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public boolean checkAnswer(String answer) {
        List<String> lowerCasedAnswers = this.answers.stream().map(String::toLowerCase).toList();
        return lowerCasedAnswers.contains(answer.toLowerCase());
    }
}
