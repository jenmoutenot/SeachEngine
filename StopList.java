/**
 * This is my code! It’s goal is to handle stoplist info
 * CS 312 - Assignment 9
 * @author Jen Moutenot
 * @version 1.0 12/10/2018 
 */

import java.util.*;
import java.io.*;

public class StopList
{
  protected HashSet<String> sList;

  /**
   * Constructs a Stop List
   * 
   * @param stopFileName the stoplist file name
   * 
   */
  StopList(String stopFileName)
  {
    sList = new HashSet<>();
    
    try
    {
      BufferedReader br = new BufferedReader(new FileReader(stopFileName));
      String word;
      
      while (true)
      {
    	word = br.readLine();
    	
    	if (word == null)
    	  break;
    	else
    	  this.sList.add(word);
      }
      br.close();
    }
    catch (Exception e)
    {
      System.out.println("Error in reading stoplist file '" + stopFileName + "'");
    }
  }

  /**
   * Determines if a word is in the stoplist file
   * Expected complexity: O(n)
   * 
   * @param str the word being checked if it is a
   * stopword
   * @return true or false, if the stop list
   * contains the word
   */
  public boolean isStopWord(String str) 
  {
	if (sList.contains(str))
	  return true;
	else
	  return false;
  }
}
