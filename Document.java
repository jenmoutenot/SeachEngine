/**
 * This is my code! It’s goal is to hold document info
 * CS 312 - Assignment 9
 * @author Jen Moutenot
 * @version 1.0 12/10/2018 
 */

import java.util.*;
import java.io.*;

public class Document
{
  protected String fileName;
  protected String wordsAsRead;
  protected ArrayList<String> wordList;

  /**
   * Constructs a new Document by taking in a file
   * 
   * @param fileName name of the document file
   * @throws FileNotFoundException 
   */
  Document(String fileName) throws FileNotFoundException
  {
    this.fileName = fileName;
    this.wordsAsRead = "";
    Scanner s = new Scanner(new File(fileName));
    wordList = new ArrayList<>();
    while (s.hasNext())
    {
      wordList.add(s.next());
    }
    s.close();
  }

  /**
   * Prints out the contents of the document
   * Expected complexity: O(1)
   */
  public void printText()
  {
    System.out.println(wordsAsRead);
  }
  
  /**
   * Generates an iterator over the words in the doc's
   * content
   * Expected complexity: O(1)
   * 
   * @return an iterator over the words in the doc's
   * content
   */
  public Iterator<String> iterator()
  {
    return new Scanner(wordsAsRead).useDelimiter("[^a-z-A-Z]+");
  }

  /**
   * Returns a string representation of the object
   * Expected complexity: O(1)
   * 
   * @return a string representation of the object
   */
  @Override
  public String toString()
  {
    return fileName;
  }

  /**
   * Checks if the word being searched is in the doc
   * Expected complexity: O(n)
   * 
   * @param key the word being searched 
   * @return true or false, if it is in the doc
   * or not
   */
  public boolean docContainWord(String key) 
  {
    for (String str : wordList)
	{
      if(str.equals(key))
      {
    	return true;
      }
	}
	return false;
  }
}
