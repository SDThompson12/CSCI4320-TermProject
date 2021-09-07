package edu.clayton.csit.antlab.person;
import java.util.*;

//Kenny Butler


/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 1 put your implementation here
	  if (input == null) {
		  throw new NoSuchElementException("Cannot edit null data");
	  }
	  else if (input.length() < 3){
		  return input;
	  } else {
		  String temp = "";
		  char a = input.charAt(0);
		  char b = input.charAt(1);
		  for (int i = 0; i < input.length()) - 2; i++){
			  temp = temp + input.charAt(i + 2);
		  }
		  temp = temp + a + b;
		  	return temp;
	  }
	  return null;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
