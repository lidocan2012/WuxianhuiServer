package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the menuuser table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="menuuser"
 */

public abstract class BaseMenuuser  implements Serializable {

	public static String REF = "Menuuser";


	// constructors
	public BaseMenuuser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenuuser (
		com.wifihi.persistance.Wspuser wSPUser,
		com.wifihi.persistance.Menu menuID) {

		this.setWSPUser(wSPUser);
		this.setMenuID(menuID);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key

	private com.wifihi.persistance.Wspuser wSPUser;

	private com.wifihi.persistance.Menu menuID;



	/**
     * @hibernate.property
     *  column=WSPUser
	 * not-null=true
	 */
	public com.wifihi.persistance.Wspuser getWSPUser () {
		return this.wSPUser;
	}

	/**
	 * Set the value related to the column: WSPUser
	 * @param wSPUser the WSPUser value
	 */
	public void setWSPUser (com.wifihi.persistance.Wspuser wSPUser) {
		this.wSPUser = wSPUser;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=MenuID
	 * not-null=true
	 */
	public com.wifihi.persistance.Menu getMenuID () {
		return this.menuID;
	}

	/**
	 * Set the value related to the column: MenuID
	 * @param menuID the MenuID value
	 */
	public void setMenuID (com.wifihi.persistance.Menu menuID) {
		this.menuID = menuID;
		this.hashCode = Integer.MIN_VALUE;
	}





	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.Menuuser)) return false;
		else {
			com.wifihi.persistance.Menuuser menuuser = (com.wifihi.persistance.Menuuser) obj;
			if (null != this.getWSPUser() && null != menuuser.getWSPUser()) {
				if (!this.getWSPUser().equals(menuuser.getWSPUser())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getMenuID() && null != menuuser.getMenuID()) {
				if (!this.getMenuID().equals(menuuser.getMenuID())) {
					return false;
				}
			}
			else {
				return false;
			}
			return true;
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			StringBuilder sb = new StringBuilder();
			if (null != this.getWSPUser()) {
				sb.append(this.getWSPUser().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getMenuID()) {
				sb.append(this.getMenuID().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}