package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.UserToWords;

@Repository
@Transactional
@EnableTransactionManagement
public class UsersToWordsImp {

  @Autowired
  private SessionFactory sf;

  public UsersToWordsImp(SessionFactory sf) {
    this.sf = sf;
  }

  public void saveOrUpdateByUserId(UserToWords word) {

    Session session = sf.getCurrentSession();
    session.saveOrUpdate(word);

  }

  public UserToWords getWordByUserId(Integer id) {

    Session session = sf.getCurrentSession();
    UserToWords genre = (UserToWords) session.get(UserToWords.class, id);
    return genre;

  }

}
