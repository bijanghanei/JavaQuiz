import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {
    QuizStyle quizStyle = new QuizStyle();
    JButton[] buttons = {quizStyle.buttonA, quizStyle.buttonB, quizStyle.buttonC, quizStyle.buttonD};
    JLabel[] labels = {quizStyle.answerLabelA, quizStyle.answerLabelB, quizStyle.answerLabelC, quizStyle.answerLabelD};

    String[] questions = {
            "What is the capital of Canada?",
            "What is capital of USA?",
            "How many countries are there?",
            "what is the SECOND most spoken language in the world?"
    };
    String[][] options = {
            {"Ottawa", "Toronto", "Vancouver", "London"},
            {"New York", "Washington DC", "California", "Los Angeles"},
            {"156", "329", "195", "97"},
            {"English", "Chinese", "Spanish", "Hindi"},
    };
    String[] answers = {
            "A", "B", "C", "C"
    };
    int correctAnswers = 0;
    int index = 0;
    int timeCounter = 10;
    String answered = "";
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            timeCounter--;
            quizStyle.timerLabel.setText(String.valueOf(timeCounter));
            if(timeCounter <= 0){
                displayAnswer(index);
            }

        }
    });

    Quiz() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
        setupQuestion(index);

    }

    private void setupQuestion(int number) {
        System.out.println(index);
        if (index == (questions.length)){
            displayResult();
        }else {
            quizStyle.textField.setText("Question" + (number + 1));
            quizStyle.textArea.setText(questions[number]);
            for (int i = 0; i < labels.length; i++) {
                labels[i].setForeground(Color.white);
                labels[i].setText(options[number][i]);
            }
            timer.start();
        }


    }

    private void displayResult() {
        timer.stop();
        double percentage = ((double)correctAnswers/(double)questions.length)*100;
        for (int i = 0; i<labels.length; i++){
            buttons[i].setEnabled(false);
            labels[i].setText("");
        }
        quizStyle.textField.setText("RESULTS!");
        quizStyle.textArea.setText("");
        quizStyle.correctAnswersNum.setText("("+correctAnswers+"/"+questions.length+")");
        quizStyle.percentage.setText(String.valueOf(percentage));
        quizStyle.frame.add(quizStyle.correctAnswersNum);
        quizStyle.frame.add(quizStyle.percentage);
    }

    private void displayAnswer(int number) {
        timer.stop();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setEnabled(false);
            if (buttons[i].getText() == answers[number]) {
                labels[i].setForeground(Color.green);
            } else {
                labels[i].setForeground(Color.red);
            }
        }

        Timer pause = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < buttons.length; i++) {
                    buttons[i].setEnabled(true);
                    buttons[i].setBackground(new Color(25,25,25));
                    labels[i].setForeground(Color.white);

                }
                timeCounter = 10;
                quizStyle.timerLabel.setText(String.valueOf(timeCounter));
                answered = "";
                index++;
                setupQuestion(index);
            }

        });
        pause.setRepeats(false);
        pause.start();;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                answered = buttons[i].getText();
                if (answered == answers[index]) {
                    buttons[i].setBackground(Color.green);
                    correctAnswers++;
                } else {
                    buttons[i].setBackground(Color.red);
                }
                displayAnswer(index);

            }


        }
    }
}
