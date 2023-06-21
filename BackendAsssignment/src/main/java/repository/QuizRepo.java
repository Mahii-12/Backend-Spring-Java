package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long>{

	public default Quiz findActive(boolean Activequiz) {
		return  findActive(Activequiz);
		
	}

	

	public default Quiz findResultById(long Id, String Result) {
		// TODO Auto-generated method stub
		return findResultById(Id,Result);
	}



	 public default Quiz findAllQuizzesById(long Id, Quiz quiz) {
		// TODO Auto-generated method stub
		return findAllQuizzesById(Id,quiz);
	}

}
