/**
 * 
 */
package entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id1;
	private String Name;
	
	private Quiz quiz;
	
	@ManyToMany(mappedBy="user")
    private ArrayList<User> users;

	/**
	 * @param id1
	 * @param name
	 * @param users
	 */
	public User(long id1, String name, ArrayList<User> users) {
		super();
		Id1 = id1;
		Name = name;
		this.users = users;
	}

	/**
	 * @return the id1
	 */
	public long getId1() {
		return Id1;
	}

	/**
	 * @param id1 the id1 to set
	 */
	public void setId1(int id1) {
		Id1 = id1;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the users
	 */
	public ArrayList<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "User [Id1=" + Id1 + ", Name=" + Name + ", users=" + users + "]";
	}

	public Quiz addQuiz(Quiz quiz) {
		
		return quiz;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	
	
	
	

}
