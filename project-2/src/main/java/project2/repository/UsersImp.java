package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.Users;

@Repository
@Transactional
@EnableTransactionManagement
public class UsersImp {

  @Autowired
  private SessionFactory sf;

  public UsersImp(SessionFactory sf) {
    this.sf = sf;
  }

  public Users getUserInfoById(Integer id) {
    
    Session session = sf.getCurrentSession();
    Users user = (Users) session.get(Users.class, id);
    return user;
    
  }

}


