package dev.jaypee;

import dev.jaypee.questions.IdentificationQuestion;
import dev.jaypee.questions.Question;

import java.util.List;

public class QuizProgram {

    public static void main(String[] args) {

        Question question = new IdentificationQuestion(
                "What is your name?",
                List.of("Jaypee", "Jaypee P. Zulieta", "Zulieta", "Jaypee")
        );

        


    }
}
