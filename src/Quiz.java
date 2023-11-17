import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {
    QuizStyle quizStyle = new QuizStyle();
    String[] questions =    {
                                "What is the capital of Canada?",
                                "What is capital of USA?",
                                "How many countries are there?",
                                "what is the SECOND most spoken language in the world?"
                            };
    String[][] options =    {
                                {"Ottawa", "Toronto", "Vancouver", "London"},
                                {"New York", "Washington DC", "California", "Los Angeles"},
                                {"156", "329", "195", "97"},
                                {"English", "Chinese", "Spanish", "Hindi"},
                            };
    char[] answers =    {
                            'A','B','C','C'
                        };
    int correctAnswers = 0;
    int index = 0;
    int timeCounter = 10;
    Quiz(){
        setupQuestion(index);
    }
    private void setupQuestion(int number){
        quizStyle.textField.setText("Question"+(number+1));
        quizStyle.textArea.setText(questions[number]);
        quizStyle.answerLabelA.setText(options[number][0]);
        quizStyle.answerLabelB.setText(options[number][1]);
        quizStyle.answerLabelC.setText(options[number][2]);
        quizStyle.answerLabelD.setText(options[number][3]);
        timeCounter = 10;
    }
    private void displayResult(){

    }
    private void displayAnswer(int number){
        quizStyle.buttonA.setEnabled(false);
        quizStyle.buttonB.setEnabled(false);
        quizStyle.buttonC.setEnabled(false);
        quizStyle.buttonD.setEnabled(false);
        if (answers[number] != 'A'){
            quizStyle.answerLabelA.setForeground(Color.red);
        }
        if (answers[number] != 'B'){
            quizStyle.answerLabelB.setForeground(Color.red);
        }
        if (answers[number] != 'C'){
            quizStyle.answerLabelC.setForeground(Color.red);
        }
        if (answers[number] != 'D'){
            quizStyle.answerLabelD.setForeground(Color.red);
        }else{

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
