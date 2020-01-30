package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.UserComments;

@Repository
@Transactional
@EnableTransactionManagement
public class UserCommentsImp {
  
  @Autowired
  private SessionFactory sf;

  public UserCommentsImp(SessionFactory sf) {
    this.sf = sf;
  }

  public UserComments getCommentInfoById(Integer id) {
    
    Session session = sf.getCurrentSession();    
    UserComments user = (UserComments) session.get(UserComments.class, id);
    return user;
    
  }


}
