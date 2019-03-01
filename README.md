# SeachEngine

-Program that serves as a search engine and searches through hashtable and hashsets.

- Use Cases:
<pre>
Name: Build Mapping
Actor: Processor
Purpose: build a mapping that associates each word found in one of the documents to the collection of documents that include that word
Main Success Scenario: The resulting data structure is an inverted index
Alternative Scenario: The data structure is not a resulting in an inverted index...FIX ME!
Common Course Use Cases: building a storage structure to retrieve documents



Name: Issue Query
Actor: User
Purpose: to retrieve a collection of documents
Main Success Scenario: display the collection in those documents associated with the query word
Alternative Scenario: the collection in those in those documents associated with the query word does not show up
Common Course Use Cases: building a storage structure to retrieve documents
-- ^^^ i.e., Build Mapping ?


Name: Display Matching Files
Actor: Processor
Purpose: The names of the retrieved documents should be printed out to standard out
Main Success Scenario: If the -d flag is given then the output should include the contents of each retrieved document
Alterative Scenario: output in its original form with whitespace preserved
Alterative Scenario: No display of retrieved documents
Common Course Use Cases: building a storage structure to retrieve documents

</pre>
