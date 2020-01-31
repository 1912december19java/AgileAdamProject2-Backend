package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_words")
public class UserWords {
  
  @Id
  @Column(name="id")
  private Integer id;
  
  @ManyToOne
  @JoinColumn(name="trainer_username")
  private Trainers trainerUser;
  
  @ManyToOne
  @JoinColumn(name="user_username")
  private Associates userUser;
  
  @Column(name="word")
  private String word;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
  
  @JsonIgnore
  public Trainers getTrainerUser() {
    return trainerUser;
  }

  public void setTrainerUser(Trainers trainerUser) {
    this.trainerUser = trainerUser;
  }
  
  @JsonIgnore
  public Associates getUserUser() {
    return userUser;
  }

  public void setUserUser(Associates userUser) {
    this.userUser = userUser;
  }

  @Override
  public String toString() {
    return "UserWords [id=" + id + ", trainerUser=" + trainerUser.getUsername() + ", userUser=" + userUser.getUsername()
        + ", word=" + word + "]";
  }

}
