package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "word_cloud")
public class WordCloud {
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="trainer_id")
  private Integer trainerId;
  
  @Column(name="total_count")
  private Integer totalCount;
  
  @Column(name="word")
  private String word;
  
  @OneToMany
  @JoinColumn(name="user_id")
  private Users userWordCount;
  
  public WordCloud() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(Integer trainerId) {
    this.trainerId = trainerId;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Users getUserWordCount() {
    return userWordCount;
  }

  public void setUserWordCount(Users userWordCount) {
    this.userWordCount = userWordCount;
  } 

}
