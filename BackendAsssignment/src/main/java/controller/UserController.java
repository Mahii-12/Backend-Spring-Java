/**
 * 
 */
package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Quiz;
import entity.User;
import repository.QuizRepo;
import repository.UserRepo;


/**
 * 
 */
@RestController
public class UserController {
	
	 @Autowired
	 private UserRepo userRepository;
	 
	 @Autowired
	 private QuizRepo quizRepository;
	 

	 @GetMapping("/findall")
	  public List<User> findAllUsers() {
			return userRepository.findAll();
	        
	  }
	 
	 @GetMapping("/{id}")
	  public long getUserById(@PathVariable(value = "id1") long id1) {
			return userRepository.findUserById(id1);
	     
	  }
	 
	 
	 @PostMapping("user/id{quizze}")
	  public Quiz addQuizByUserById(@Validated @RequestBody User user,Quiz quiz,long id) {
		quiz.setId(id);
		return userRepository.addQuiz(quiz);
	 
	 }
	 
	 @GetMapping("quiz/{active}")
	  public Quiz getActiveQuiz(@PathVariable(value="Active")boolean Activequiz) {
		    return quizRepository.findActive(Activequiz);
	 }
	 
	 @GetMapping("quiz/id{result}")
	 public Quiz getQuizResult(@PathVariable(value="Id") long Id,@PathVariable(value="Result") String Result) {
		 return quizRepository.findResultById(Id,Result);
	 }
	 
	 @GetMapping("/allquizzes")
	 public Quiz getAllQuizzes(@PathVariable(value="Id") long Id, @Validated @RequestBody Quiz quiz) {
		return quizRepository.findAllQuizzesById(Id,quiz);
		 
	 }
	
	 
	
	 
	 
	
}
