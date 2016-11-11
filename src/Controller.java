import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by cierralewis on 11/10/16.
 */

public class Controller implements ActionListener {
    static public class Category {
        public String category;
        public Question[] questions;
        public Category(){
            category = " ";
            questions = new Question[25];
        }

    }
   static public class Question {
        public Question(){
            String question = " ";
            Answers[] answers = new Answers[4];

        }


//        public String getQuestion() {
//            return question;
//        }
//        public void setQuestion(String q) {
//            question = q;
//        }

    }
    public class Answers extends JButton {
        public Answers(){
            String answer = " ";
            boolean right = false;
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
