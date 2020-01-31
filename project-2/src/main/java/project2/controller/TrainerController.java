package project2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project2.model.Trainers;
import project2.repository.TrainersImp;

@RestController
@RequestMapping("/trainers")
public class TrainerController {
  
  @Autowired
  private TrainersImp trainDao;
  
  @GetMapping("/{username}")
  public Trainers get(@PathVariable String username) {
      return trainDao.getTrainerInfoByUsername(username);
  }

}
