package project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project2.model.Associates;
import project2.repository.AssociatesImp;

@RestController
@CrossOrigin
@RequestMapping("/associates")
public class AssociateController {
  

  
  @Autowired
  private AssociatesImp assDao;
  
  @GetMapping
  public List<Associates> getAllUsers() {
	  System.out.println("hi");
	  return assDao.getAllUsers();
  }

  @GetMapping("/{username}")
  public Associates get(@PathVariable String username) {
      return assDao.getUserInfoByUsername(username);
  }

}
