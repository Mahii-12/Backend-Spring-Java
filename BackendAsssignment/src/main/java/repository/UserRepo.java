/**
 * 
 */
package repository;




import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Quiz;
import entity.User;

/**
 * 
 */
public interface UserRepo extends JpaRepository<User,Integer>{

	Optional<User> findById(long id1);

	public default long findUserById(long id1) {
		// TODO Auto-generated method stub
		return id1;
	}
	
	
	

	public default Quiz addQuiz(Quiz quiz) {
		return quiz;
		
	}

	
	
 
}
