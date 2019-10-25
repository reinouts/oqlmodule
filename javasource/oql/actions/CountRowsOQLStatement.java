// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.
package oql.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import oql.implementation.OQL;

/**
 * This action executes the OQL statement and returns the amount of rows which will be returned by
 * the OQL statement. The main purpose of this action was to avoid overhead of object creation while
 * the interest is to determine if a record within the database exists.
 */
public class CountRowsOQLStatement extends CustomJavaAction<java.lang.Long> {

	private java.lang.String statement;
	private java.lang.Long amount;
	private java.lang.Long offset;

	public CountRowsOQLStatement(IContext context, java.lang.String statement, java.lang.Long amount, java.lang.Long offset) {
		super(context);
		this.statement = statement;
		this.amount = amount;
		this.offset = offset;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception {
		// BEGIN USER CODE
		IContext context = getContext().createSudoClone();

		Long result = OQL.countRowsOQL(context, statement, amount);

		OQL.resetParameters();
		return result;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString() {
		return "CountRowsOQLStatement";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
