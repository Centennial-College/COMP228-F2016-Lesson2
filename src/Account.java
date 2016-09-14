/**
 * This class represents a BankAccount
 * 
 * @author kevinma
 *
 */
public class Account {
	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++++++++++
	// Account name. Accessible only within this class
	private String _name;

	// CONSTRUCTORS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * Constructor that takes one string argument for name for Account object
	 * 
	 * @public
	 * @constructor
	 * @param name
	 */
	public Account(String name) {
		this._name = name;
	}

	// PUBLIC METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * Setter method for _name
	 * 
	 * @public
	 * @method setName
	 * @param name
	 */
	public void setName(String name) {

		// Write code to check the format of the name

		this._name = name;
	}

	/**
	 * Getter method for _name
	 * 
	 * @public
	 * @method getName
	 * @return {String}
	 */
	public String getName() {
		return _name;
	}

}
