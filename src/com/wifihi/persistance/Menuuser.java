package com.wifihi.persistance;

import com.wifihi.persistance.base.BaseMenuuser;



public class Menuuser extends BaseMenuuser {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Menuuser () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Menuuser (
		com.wifihi.persistance.Wspuser wSPUser,
		com.wifihi.persistance.Menu menuID) {

		super (
			wSPUser,
			menuID);
	}

/*[CONSTRUCTOR MARKER END]*/


}