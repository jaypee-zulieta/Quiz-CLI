package dev.jaypee.questions;

import java.util.Arrays;
import java.util.List;

public class CaseSensitiveEnumerationQuestion extends EnumerationQuestion {

  public CaseSensitiveEnumerationQuestion(String question, List<String> answers) {
    super(question, answers);
  }

  @Override
  protected List<String> processUserAnswers(String answer) {
    List<String> rawUserAnswer = Arrays.asList(answer.split(","));
    return rawUserAnswer.stream().map(s -> s.trim()).toList();
  }

  @Override
  protected List<String> processAnswers(List<String> answers) {
    return answers;
  }

}
