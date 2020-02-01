package project2.repository;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.UserWords;

@Repository
@Transactional
@EnableTransactionManagement
public class UserWordsImp {
  
  @Autowired
  private SessionFactory sf;

  public UserWordsImp(SessionFactory sf) {
    this.sf = sf;
  }

  public UserWords getWordInfoById(Integer id) {
    
    Session session = sf.getCurrentSession();    
    UserWords user = (UserWords) session.get(UserWords.class, id);    
    return user;
  }
  
  public List<UserWords> getAllWordsByTrainer(String trainerUsername){
    Session session = sf.getCurrentSession();
    Query q = session.createQuery("from UserWords where trainer_username = :trainerUser");
    q.setParameter("trainerUser", trainerUsername);
    
    
    List<UserWords> result = q.list();
    
    return result;
    
  }
  
  public List<UserWords> getAllWordsByAssociate(String associateUsername){
    Session session = sf.getCurrentSession();
    Query q = session.createQuery("from UserWords where user_username = :userUser");
    q.setParameter("userUser", associateUsername);
    
    List<UserWords> result = q.list();
    
    return result;
    
  }
  
  public void saveOrUpdateWord(UserWords newWord) {
    
    Session session = sf.getCurrentSession();
    
    session.saveOrUpdate(newWord);
  }


}
