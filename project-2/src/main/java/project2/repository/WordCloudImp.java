package project2.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import project2.model.WordCloud;

@Repository
@Transactional
@EnableTransactionManagement
public class WordCloudImp {

  @Autowired
  private SessionFactory sf;

  public WordCloudImp(SessionFactory sf) {
    this.sf = sf;
  }

  public void updateTotalCount(WordCloud count) {

    Session session = sf.getCurrentSession();
    session.update(count);
  }

  public WordCloud getTotalCountByTrainerId(Integer id) {
    
    Session session = sf.getCurrentSession();
    WordCloud genre = (WordCloud) session.get(WordCloud.class, id);
    return genre;
  }
  
  public void saveOrUpdateByTrainerId(WordCloud word) {

    Session session = sf.getCurrentSession();
    session.saveOrUpdate(word);

  }


}
