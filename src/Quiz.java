import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {
    QuizStyle quizStyle = new QuizStyle();
    JButton[] buttons = {quizStyle.buttonA,quizStyle.buttonB,quizStyle.buttonC,quizStyle.buttonD};
    JLabel[] labels = {quizStyle.answerLabelA,quizStyle.answerLabelB,quizStyle.answerLabelC,quizStyle.answerLabelD};

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
    String[] answers =    {
                            "A","B","C","D"
                        };
    int correctAnswers = 0;
    int index = 0;
    int timeCounter = 10;
    String answered = "";
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
        for (int i = 0; i<buttons.length ; i++){
            if (buttons[i].getText() == answers[number]){
                labels[i].setForeground(Color.green);
            }else{
                labels[i].setForeground(Color.red);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quizStyle.buttonA){
            answered = "A";
        }

    }
}
