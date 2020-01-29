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
@Table(name = "user_to_words")
public class UserToWords {
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="trainer_id")
  private Integer trainerId;
  
  @Column(name="user_id")
  private Integer userId;
  
  @Column(name="word")
  private String word;
  
  @OneToMany
  @JoinColumn(name="user_id")
  private Users userWord;

  public UserToWords() {
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

  public Integer getTotalCount() {
    return userId;
  }

  public void setTotalCount(Integer userId) {
    this.userId = userId;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Users getUserWord() {
    return userWord;
  }

  public void setUserWord(Users userWord) {
    this.userWord = userWord;
  }
  
  

}
