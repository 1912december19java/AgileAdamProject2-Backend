package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.AccountInfo;

@Repository
@Transactional
@EnableTransactionManagement
public class AccountInfoImp {

  @Autowired
  private SessionFactory sf;

  public AccountInfoImp(SessionFactory sf) {
    this.sf = sf;
  }

  public AccountInfo getInfoByTrainerId(Integer id) {
    
    Session session = sf.getCurrentSession();
    AccountInfo trainerId = (AccountInfo) session.get(AccountInfo.class, id);
    return trainerId;
    
  }

}
