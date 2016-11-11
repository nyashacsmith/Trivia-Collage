/**
 * Created by nyasha on 11/11/16.
 */
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
