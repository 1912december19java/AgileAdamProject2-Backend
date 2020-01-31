package project2.driver;

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
   //Getting all trainers 
    TrainersImp trainAllDao = ac.getBean(TrainersImp.class);
    List<Trainers> trainers = trainAllDao.getAllTrainerInformation();
    System.out.println(trainers.toString());
  //Getting comment info by comment id
    UserCommentsImp commDao = ac.getBean(UserCommentsImp.class);
    UserComments comm = commDao.getCommentInfoById(1);
    System.out.println(comm.toString());
  //Getting word info by word id
    UserWordsImp wordDao = ac.getBean(UserWordsImp.class);
    UserWords word = wordDao.getWordInfoById(1);
    System.out.println(word.toString());
  //Closing application context
    ((ConfigurableApplicationContext)ac).close();
    
  }
}
