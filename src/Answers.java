/**
 * Created by nyasha on 11/11/16.
 */
import javax.swing.*;
public class Answers extends JButton {
        public String answer = " ";
        public boolean right = false;
    public Answers[] answers = new Answers[4];
        public Answers(String a, boolean b) {
            answer = a;
            boolean right = b;
        }
    public void addAnswerArray(Answers a, int index){answers[index] = a;}
    public Answers[] getAnswers(){
        return answers;
    }
}
