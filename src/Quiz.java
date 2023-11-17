import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {
    QuizStyle quizStyle = new QuizStyle();
    Quiz(){
        quizStyle.frame.setTitle("TESSSSSSSSSSSSSSSSST");
        quizStyle.buttonA.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quizStyle.buttonA){
            System.out.println("Boooooooooooooooooooo");
        }
    }
}
