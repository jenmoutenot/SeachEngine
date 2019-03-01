/**
 * This is my code! It’s goal is to handle the database info
 * CS 312 - Assignment 9
 * @author Jen Moutenot
 * @version 1.0 12/10/2018 
 */

import java.io.IOException;
import java.util.*;

public class InvertedIndex
{
  protected HashMap<String, HashSet<Document>> database;
  protected String word;
  protected HashSet<Document> documents;
  protected StopList sList;
  protected String stopFileName;
  
  /**
   * Constructs an inverted index
   * 
   * @param word word that is being searched
   */
  InvertedIndex(String word)
  {
	this.word = word;
    database = new HashMap<>();
    documents = new HashSet<>();
  }
  
  /** 
   * Adds file content into inverted index
   * Expected complexity: O(n^2)
   * 
   * @param doc the document to be indexed
   * @return a Document HashSet
   */
  public HashSet<Document> addDocument(Document doc)
  {
    documents.add(doc);
    return documents;
  }
  
  /**
   * Checks if a query word is in the document
   * and displays which documents contain query
   * Expected complexity: O(n^2)
   * 
   * @param line the lines to be read from the 
   * buffered reader in the CLI from the doc
   * @return a Document HashSet (document that 
   * contains the query)
   */
  public HashSet<Document> multiWordQuery(String line) 
  {
    StopList stoplist = new StopList(stopFileName);
    HashSet<Document> docs = new HashSet<>();
    StringTokenizer strTokenizer = new StringTokenizer(line);
    while (strTokenizer.hasMoreTokens())
    {
      String queryWord = strTokenizer.nextToken();
      if (!stoplist.isStopWord(queryWord))
      {
    	for (Document d: documents)
    	{
    	  if (d.docContainWord(queryWord))
    	  {
    		if (!docs.contains(d))
    		  docs.add(d);
    	  }
    	}
      }
    }
    if (docs.isEmpty())
      System.out.println("Cannot find '" + line + "' in any documents");
    return docs;
  }
  
  /**
   * Dumps the current contents of the inverted index 
   * Expected complexity: O(1)
   */
  public void dumpIndex()
  {
    System.out.println("Inverted index contents: " + database);
  }
}
