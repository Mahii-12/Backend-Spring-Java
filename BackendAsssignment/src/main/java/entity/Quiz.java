/**
 * 
 */
package entity;


import java.net.URI;
import java.util.ArrayList;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "quiz")
public class Quiz {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@ManyToMany
    @JoinColumn(name="user_id")
	private User user;
	
	@Column(name = "Quiztext")
	private String Question;
	
	@Column(name = "Options")
	private ArrayList<String> options = new ArrayList<String>();

	@Column(name = "rightanswer")
	private boolean rightanswer;
	 
	@Column(name = "Startdate")
	private int Startdate;
	 
	@Column(name = "Enddate") 
	private int Enddate;
	
	private boolean Activequiz;
	
	@Column(name = "Result") 
	private String Result;
	
	

	/**
	 * @param id
	 * @param user
	 * @param question
	 * @param options
	 * @param rightanswer
	 * @param startdate
	 * @param enddate
	 * @param activequiz
	 * @param result
	 */
	public Quiz(long id, User user, String question, ArrayList<String> options, boolean rightanswer, int startdate,
			int enddate, boolean activequiz, String result) {
		super();
		Id = id;
		this.user = user;
		Question = question;
		this.options = options;
		this.rightanswer = rightanswer;
		Startdate = startdate;
		Enddate = enddate;
		Activequiz = activequiz;
		Result = result;
	}



	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}



	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}



	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}



	/**
	 * @return the question
	 */
	public String getQuestion() {
		return Question;
	}



	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		Question = question;
	}



	/**
	 * @return the options
	 */
	public ArrayList<String> getOptions() {
		return options;
	}



	/**
	 * @param options the options to set
	 */
	public void setOptions(ArrayList<String> options) {
		this.options = options;
	}



	/**
	 * @return the rightanswer
	 */
	public boolean isRightanswer() {
		return rightanswer;
	}



	/**
	 * @param rightanswer the rightanswer to set
	 */
	public void setRightanswer(boolean rightanswer) {
		this.rightanswer = rightanswer;
	}



	/**
	 * @return the startdate
	 */
	public int getStartdate() {
		return Startdate;
	}



	/**
	 * @param startdate the startdate to set
	 */
	public void setStartdate(int startdate) {
		Startdate = startdate;
	}



	/**
	 * @return the enddate
	 */
	public int getEnddate() {
		return Enddate;
	}



	/**
	 * @param enddate the enddate to set
	 */
	public void setEnddate(int enddate) {
		Enddate = enddate;
	}



	/**
	 * @return the activequiz
	 */
	public boolean isActivequiz() {
		return Activequiz;
	}



	/**
	 * @param activequiz the activequiz to set
	 */
	public void setActivequiz(boolean activequiz) {
		Activequiz = activequiz;
	}



	/**
	 * @return the result
	 */
	public String getResult() {
		return Result;
	}



	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		Result = result;
	}



	@Override
	public String toString() {
		return "Quiz [Id=" + Id + ", user=" + user + ", Question=" + Question + ", options=" + options
				+ ", rightanswer=" + rightanswer + ", Startdate=" + Startdate + ", Enddate=" + Enddate + ", Activequiz="
				+ Activequiz + ", Result=" + Result + "]";
	}



	public static URI created(URI location) {
		// TODO Auto-generated method stub
		return location;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
