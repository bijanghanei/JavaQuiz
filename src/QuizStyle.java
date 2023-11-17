import javax.swing.*;
import java.awt.*;

public class QuizStyle {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answerLabelA = new JLabel();
    JLabel answerLabelB = new JLabel();
    JLabel answerLabelC = new JLabel();
    JLabel answerLabelD = new JLabel();
    JLabel timerLabel = new JLabel();
    JTextField correctAnswersNum = new JTextField();
    JTextField percentage = new JTextField();

    QuizStyle(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(650,650);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.BLACK);

        textField.setBounds(0,0,650,50);
        textField.setBackground(new Color(25,25,25));
        textField.setForeground(new Color(25,255,0));
        textField.setFont(new Font("Arial",Font.BOLD,30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);


        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25,25,25));
        textArea.setBounds(0,50,650,50);
        textArea.setForeground(new Color(25,255,0));
        textArea.setFont(new Font("Arial",Font.BOLD,30));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);


        buttonA.setFocusable(false);
        buttonA.setBounds(0,100,100,100);
        buttonA.setBackground(new Color(25,25,25));
        buttonA.setFont(new Font("Arial",Font.BOLD,35));
        buttonA.setText("A");

        buttonB.setFocusable(false);
        buttonB.setBounds(0,200,100,100);
        buttonB.setBackground(new Color(25,25,25));
        buttonB.setFont(new Font("Arial",Font.BOLD,35));
        buttonB.setText("B");

        buttonC.setFocusable(false);
        buttonC.setBounds(0,300,100,100);
        buttonC.setBackground(new Color(25,25,25));
        buttonC.setFont(new Font("Arial",Font.BOLD,35));
        buttonC.setText("C");

        buttonD.setFocusable(false);
        buttonD.setBounds(0,400,100,100);
        buttonD.setBackground(new Color(25,25,25));
        buttonD.setFont(new Font("Arial",Font.BOLD,35));
        buttonD.setText("D");

        answerLabelA.setBounds(100,100,500,100);
        answerLabelA.setBackground(new Color(50,50,50));
        answerLabelA.setForeground(Color.white);
        answerLabelA.setFont(new Font("Arial",Font.PLAIN,35));
        answerLabelA.setOpaque(true);

        answerLabelA.setBounds(100,100,500,100);
        answerLabelA.setBackground(new Color(50,50,50));
        answerLabelA.setForeground(Color.white);
        answerLabelA.setFont(new Font("Arial",Font.PLAIN,35));
        answerLabelA.setOpaque(true);

        answerLabelB.setBounds(100,200,500,100);
        answerLabelB.setBackground(new Color(50,50,50));
        answerLabelB.setForeground(Color.white);
        answerLabelB.setFont(new Font("Arial",Font.PLAIN,35));
        answerLabelB.setOpaque(true);

        answerLabelC.setBounds(100,300,500,100);
        answerLabelC.setBackground(new Color(50,50,50));
        answerLabelC.setForeground(Color.white);
        answerLabelC.setFont(new Font("Arial",Font.PLAIN,35));
        answerLabelC.setOpaque(true);

        answerLabelD.setBounds(100,400,500,100);
        answerLabelD.setBackground(new Color(50,50,50));
        answerLabelD.setForeground(Color.white);
        answerLabelD.setFont(new Font("Arial",Font.PLAIN,35));
        answerLabelD.setOpaque(true);


        timerLabel.setBounds(500,500,100,100);
        timerLabel.setBackground(Color.red);
        timerLabel.setForeground(Color.white);
        timerLabel.setFont(new Font("Arial",Font.BOLD,35));
        timerLabel.setText("10");
        timerLabel.setHorizontalAlignment(JLabel.CENTER);
        timerLabel.setOpaque(true);

        correctAnswersNum.setBounds(225,225,200,100);
        correctAnswersNum.setBackground(new Color(25,25,25));
        correctAnswersNum.setForeground(new Color(25,255,0));
        correctAnswersNum.setFont(new Font("Arial",Font.BOLD,50));
        correctAnswersNum.setBorder(BorderFactory.createBevelBorder(1));
        correctAnswersNum.setHorizontalAlignment(JTextField.CENTER);
        correctAnswersNum.setEditable(false);

        percentage.setBounds(225,325,200,100);
        percentage.setBackground(new Color(25,25,25));
        percentage.setForeground(new Color(25,255,0));
        percentage.setFont(new Font("Arial",Font.BOLD,50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);



        frame.add(textField);
        frame.add(textArea);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(answerLabelA);
        frame.add(answerLabelB);
        frame.add(answerLabelC);
        frame.add(answerLabelD);
        frame.add(timerLabel);
        frame.setVisible(true);
    }
}
