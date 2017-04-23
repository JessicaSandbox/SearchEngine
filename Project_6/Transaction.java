package Project_6;

/* Class Transaction objects represent any deposit, withdrawal, or other 
 * transaction on an account.  (Note transfers are implemented as a pair of 
 * transactions.)  This class contains files for a transaction ID, a timestamp
 * (the date and time of the transaction), the type of transaction, the 
 * amount, and a description.  None of these fields have setters.
 */
public class Transaction implements Comparable<Transaction> {
	
	// Test code
	static double Amount;
	
	// Create a new transaction 
	public Transaction(TransactionType type, double amount, 
			           String description) {
		
		// Test code
		Amount = amount;
	}
	
	//@Override
	public int compareTo(Transaction arg0) {
		return 0;
	} 
	
	/* Getters, setters, (for example, to get and possibly set the id, 
	 * transaction timestamp, type, amount, and description), toString, and 
	 * other methods as needed
	 * 
	 * You need to test any non-trivial methods your group decides are a good 
	 * idea. */
} // Class Transaction