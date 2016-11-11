
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controller implements ActionListener {
   public String category;
    public class Category {
        String category;
        Question[] questions = new Question[25];
        public Category(String c, Question[] q) {
            category = c;
            questions = q;
        }
        public void addQuestionArray(Question qu, int i) {questions[i] = qu;}
        public Question[] getQuestions(){return questions;}
    }


        public class Question {
            public String question;
            public Answers[] answers = new Answers[4];
        public Question(String q, Answers[] a) {
             question = q;
             answers = a;
        }


        public void addAnswerArray(Answers a, int index){answers[index] = a;}
        public Answers[] getAnswers(){
          return answers;
        }

    }

        public class Answers extends JButton {
            public String answer = " ";
            public boolean right = false;
            public Answers(String a, boolean b) {
            answer = a;
            boolean right = b;
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
