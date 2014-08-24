package com.wifihi.persistance;

import com.wifihi.persistance.base.BaseWspuser;



public class Wspuser extends BaseWspuser {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Wspuser () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Wspuser (java.lang.Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Wspuser (
		java.lang.Long id,
		java.lang.String phoneNumber) {

		super (
			id,
			phoneNumber);
	}

/*[CONSTRUCTOR MARKER END]*/


}