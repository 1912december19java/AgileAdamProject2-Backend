package project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import project2.model.UserComments;
import project2.repository.UserCommentsImp;
import project2.service.ModelService;

@RestController
@CrossOrigin
@RequestMapping("/comments")
public class UserCommentController {
  
  @Autowired
  private ModelService<UserComments> userCommentsService;
  
  @Autowired
  private UserCommentsImp commentDao;
  
  
  @GetMapping
  public List<UserComments> getAllUserComments(){
	  return userCommentsService.getAll();
  }
  
  
  @GetMapping("/{id}")
  public UserComments on(@PathVariable int id) {
      return userCommentsService.getById(id);
  }
  
  
  //@PostMapping(consumes = "application/json")
  @PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Integer create(UserComments userComments) {
		return userCommentsService.save(userComments);
	}
	
	
  @PutMapping(value = "/{id}")
	public UserComments update(@RequestBody UserComments userComments, @PathVariable int id) {
		userComments.setId(id);
		userCommentsService.saveOrUpdate(userComments);
		return userComments;
	}
  
  @GetMapping("/byTrainer/{username}")
  public List<UserComments> getAllCommentsForTrainer(@PathVariable String username) {
    return commentDao.getAllCommentsOfTrainer(username);
  }

}
