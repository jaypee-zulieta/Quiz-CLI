package dev.jaypee.questions;

import java.util.Arrays;
import java.util.List;

public class CaseSensitiveOrderedEnumerationQuestion extends OrderedEnumerationQuestion{

    public CaseSensitiveOrderedEnumerationQuestion(String question, List<String> answers) {
        super(question, answers);
    }

    @Override
    protected List<String> processUserAnswers(String answer) {
        List<String> rawUserAnswers = Arrays.asList(answer.split(","));
        return rawUserAnswers.stream().map(s -> s.trim()).toList();
    }

    @Override
    protected List<String> processAnswers(List<String> answers) {
        return answers;
    }
}
