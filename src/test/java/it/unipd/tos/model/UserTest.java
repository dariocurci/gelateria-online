package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.Test;
import it.unipd.tos.model.User;

public class UserTest {

	@Test
	public void getAge_Test() {
	    User user1= new User ("username1","andrea","rossi","via piazza",30);
	    User user2= new User ("username2","andrea","rossi","via piazza",40);
	    
	    assertEquals(30,user1.getAge());
	    assertEquals(40,user2.getAge());
	  }
	
	@Test
	  public void getUsername_Test() {
		User user1= new User ("username1","andrea","rossi","via piazza",30);
	    User user2= new User ("username2","andrea","rossi","via piazza",40);
	    
	    assertEquals("username1",user1.getUsername());
	    assertEquals("username2",user2.getUsername());
	 
	  
	}

}
