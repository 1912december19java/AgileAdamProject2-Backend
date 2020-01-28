package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
  
  public AccountInfo() {
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
