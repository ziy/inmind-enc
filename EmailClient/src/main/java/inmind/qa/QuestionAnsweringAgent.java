package inmind.qa;

/**
 * Created by ziy on 8/5/15.
 */
public interface QuestionAnsweringAgent {

  void addDocument(String document);

  String getAnswer(String question);

}
