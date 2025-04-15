package dev.jaypee.questions;

import java.util.List;

public class OrderedEnumerationQuestion extends EnumerationQuestion {

    public OrderedEnumerationQuestion(String question, List<String> answers) {
        super(question, answers);
    }

    @Override
    public boolean checkAnswer(String answer) {
        List<String> userAnswers = this.processUserAnswers(answer);
        List<String> answers = this.processAnswers(this.answers);

        if (userAnswers.size() != answers.size())
            return false;

        for (int i = 0; i < userAnswers.size(); i++)
            if (!userAnswers.get(i).equals(answers.get(i)))
                return false;

        return true;
    }
}
