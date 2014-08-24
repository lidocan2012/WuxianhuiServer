package com.wifihi.persistance;

import com.wifihi.persistance.base.BaseUser;



public class User extends BaseUser {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public User () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public User (java.lang.Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public User (
		java.lang.Long id,
		java.lang.String phoneNumber) {

		super (
			id,
			phoneNumber);
	}

/*[CONSTRUCTOR MARKER END]*/


}