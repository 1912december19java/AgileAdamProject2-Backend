package project2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_comments")
public class UserComments {
  
  @Id
  @Column(name="id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(name="trainer_id")
  private Integer trainerId;
  
  @Column(name="user_id")
  private Integer userId;
  
  @Column(name="date_posted")
  private String datePosted;
  
  @Column(name="comment_text")
  private String commentText;
  
  public UserComments() {
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

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getDatePosted() {
    return datePosted;
  }

  public void setDatePosted(String datePosted) {
    this.datePosted = datePosted;
  }

  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }  

}
