package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_info")
public class AccountInfo {
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="trainer_id")
  private Integer trainerId;
  
  @Column(name="trainer_location")
  private String trainerLocation;
  
  @Column(name="curriculum")
  private String curriculum;
  
  @OneToOne
  @JoinColumn(name="trainer_id")
  private Users userInfo;

  public AccountInfo() {
    super();
  }
  
  public Users getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(Users userInfo) {
    this.userInfo = userInfo;
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

  public String getTrainerLocation() {
    return trainerLocation;
  }

  public void setTrainerLocation(String trainerLocation) {
    this.trainerLocation = trainerLocation;
  }

  public String getCurriculum() {
    return curriculum;
  }

  public void setCurriculum(String curriculum) {
    this.curriculum = curriculum;
  }  

}
