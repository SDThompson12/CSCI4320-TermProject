package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Humberto Marin
 *  @version 1.1
 */
public class Person5 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
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

		String str = input;

		char[] charArray = str.toCharArray();
		int size = charArray.length;

		for (int i = 0 ; i <= 2 ; i++) {
			char first = charArray[0];
			for (int j = 0; j < size - 1; j++) {
				charArray[j] = charArray[j + 1];
			}
			charArray[size - 1] = first;
		}


		StringBuffer sb = new StringBuffer();
		for (char c : charArray) {
			sb.append(c);
		}
		//System.out.println(sb);

	  return sb.toString();
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
