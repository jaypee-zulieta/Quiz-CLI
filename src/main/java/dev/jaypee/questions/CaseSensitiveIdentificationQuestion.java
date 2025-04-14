package dev.jaypee.questions;

import java.util.List;

public class CaseSensitiveIdentificationQuestion extends IdentificationQuestion {

    public CaseSensitiveIdentificationQuestion(String question, List<String> answers) {
        super(question, answers);
    }

    @Override
    public boolean checkAnswer(String answer) {
        return this.answers.contains(answer);
    }
}
