package project2.driver;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import project2.model.Associates;
import project2.model.Trainers;
import project2.model.UserComments;
import project2.model.UserWords;
import project2.repository.AssociatesImp;
import project2.repository.TrainersImp;
import project2.repository.UserCommentsImp;
import project2.repository.UserWordsImp;

public class Driver {
  
  public static void main(String[] args) {
    
    ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    
  //Getting associate info by associate username
    AssociatesImp assDao = ac.getBean(AssociatesImp.class);    
    Associates ass = assDao.getUserInfoByUsername("dking");    
    System.out.println(ass.toString());
  //Getting trainer info by trainer username
    TrainersImp trainDao = ac.getBean(TrainersImp.class);
    Trainers train = trainDao.getTrainerInfoByUsername("aking");    
    System.out.println(train.toString());
  //Getting comment info by comment id
    UserCommentsImp commDao = ac.getBean(UserCommentsImp.class);
    UserComments comm = commDao.getCommentInfoById(1);
    System.out.println(comm.toString());
  //Getting word info by word id
    UserWordsImp wordDao = ac.getBean(UserWordsImp.class);
    UserWords word = wordDao.getWordInfoById(1);
    System.out.println(word.toString());
    
  //Add a new word
    System.out.println("Save new word");
    UserWords newWord = new UserWords();
    Associates newAssociate = new Associates();
    newAssociate.setFirstName("Donkey");
    newAssociate.setLastName("Kong");
    newAssociate.setPasscode("Smash");
    newAssociate.setUsername("dking");
    newAssociate.setPicture(null);
    Trainers newTrainer = new Trainers();
    newTrainer.setFirstName("Adam King");
    newTrainer.setLastName("King");
    newTrainer.setPasscode("Revature");
    newTrainer.setUsername("aking");
    newWord.setWord("Sad");
    newWord.setId(2);
    newWord.setTrainerUser(newTrainer);
    newWord.setUserUser(newAssociate);
    wordDao.saveOrUpdateWord(newWord);
  //Getting all words by trainer
    System.out.println("GET WORDS TESTING");
    List<UserWords> allWordsByTrainer = wordDao.getAllWordsByTrainer("aking");
    System.out.println(allWordsByTrainer);
  //Getting all words by associate
    List<UserWords> allWordsByAssociate = wordDao.getAllWordsByAssociate("dking");
    System.out.println(allWordsByAssociate);
  //Closing application context
    ((ConfigurableApplicationContext)ac).close();
    
  }
}
