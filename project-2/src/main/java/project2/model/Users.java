package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="istrainer")
  private Boolean isTrainer;
  
  @Column(name="first_name")
  private String firstName;
  
  @Column(name="last_name")
  private String lastName;
  
  @OneToOne
  @JoinColumn(name="trainer_id")
  private AccountInfo account;
  
  @ManyToOne
  @JoinColumn(name="user_id")
  private UserComments userComment;
  
  @ManyToOne
  @JoinColumn(name="user_id")
  private WordCloud trainerWord;
  
  @ManyToOne
  @JoinColumn(name="user_id")
  private UserToWords userWord;
  
  public Users() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getIsTrainer() {
    return isTrainer;
  }

  public void setIsTrainer(Boolean isTrainer) {
    this.isTrainer = isTrainer;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
}
