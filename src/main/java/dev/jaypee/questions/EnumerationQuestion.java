package dev.jaypee.questions;

import java.util.Arrays;
import java.util.List;

public class EnumerationQuestion extends Question {

  public EnumerationQuestion(String question, List<String> answers) {
    super(question, answers);
  }

  @Override
  public String getQuestion() {
    return this.question;
  }

  protected List<String> processAnswers(List<String> answers) {
    return this.getAnswers().stream().map(s -> s.toLowerCase()).toList();
  }

  protected List<String> processUserAnswers(String answer) {
    List<String> rawUserAnswer = Arrays.asList(answer.split(","));
    return rawUserAnswer.stream().map(s -> s.trim().toLowerCase()).toList();
  }

  protected static boolean isInAnswers(List<String> answers, List<String> userAnswers) {
    for (String individualAnswer : userAnswers)
      if (!answers.contains(individualAnswer))
        return false;
    return true;
  }

  @Override
  public boolean checkAnswer(String answer) {
    List<String> answers = processAnswers(this.answers);
    List<String> userAnswers = processUserAnswers(answer);
    return EnumerationQuestion.isInAnswers(answers, userAnswers);
  }

}
