package project2.repository;

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


}
