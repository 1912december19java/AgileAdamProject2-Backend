package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.Trainers;

@Repository
@Transactional
@EnableTransactionManagement
public class TrainersImp {
  
  @Autowired
  private SessionFactory sf;

  public TrainersImp(SessionFactory sf) {
    this.sf = sf;
  }

  public Trainers getTrainerInfoByUsername(String username) {
    
    Session session = sf.getCurrentSession();
    
    
    Trainers user = (Trainers) session.get(Trainers.class, username);
    
    
    return user;
    
  }


}
