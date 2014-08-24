package com.wifihi.persistance;

import com.wifihi.persistance.base.BaseWifimanage;



public class Wifimanage extends BaseWifimanage {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Wifimanage () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Wifimanage (java.lang.Long id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Wifimanage (
		java.lang.Long id,
		com.wifihi.persistance.Wspuser wSPUser,
		java.lang.String wifiName) {

		super (
			id,
			wSPUser,
			wifiName);
	}

/*[CONSTRUCTOR MARKER END]*/


}