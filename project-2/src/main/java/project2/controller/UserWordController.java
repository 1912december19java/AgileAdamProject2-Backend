package project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project2.model.UserWords;
import project2.repository.UserWordsImp;

@RestController
@RequestMapping("/words")
public class UserWordController {
  
  @Autowired
  private UserWordsImp wordDao;
  
  @GetMapping("/{id}")
  public UserWords get(@PathVariable Integer id) {
      return wordDao.getWordInfoById(id);
  }

}
