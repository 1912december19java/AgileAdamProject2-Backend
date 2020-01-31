package project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project2.model.UserComments;
import project2.repository.UserCommentsImp;

@RestController
@RequestMapping("/comments")
public class UserCommentController {
  
  @Autowired
  private UserCommentsImp commDao;
  
  @GetMapping("/{id}")
  public UserComments get(@PathVariable Integer id) {
      return commDao.getCommentInfoById(id);
  }

}
