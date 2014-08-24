package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the menu table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="menu"
 */

public abstract class BaseMenu  implements Serializable {

	public static String REF = "Menu";
	public static String PROP_MENU_NAME = "MenuName";
	public static String PROP_ID = "Id";
	public static String PROP_ADDR = "Addr";
	public static String PROP_PARENT_I_D = "ParentID";


	// constructors
	public BaseMenu () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMenu (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMenu (
		java.lang.Long id,
		java.lang.String menuName) {

		this.setId(id);
		this.setMenuName(menuName);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String menuName;
	private java.lang.String addr;
	private java.lang.Long parentID;

	// collections
	private java.util.Set<com.wifihi.persistance.Wspuser> wspusers;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="MenuID"
     */
	public java.lang.Long getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Long id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: MenuName
	 */
	public java.lang.String getMenuName () {
		return menuName;
	}

	/**
	 * Set the value related to the column: MenuName
	 * @param menuName the MenuName value
	 */
	public void setMenuName (java.lang.String menuName) {
		this.menuName = menuName;
	}



	/**
	 * Return the value associated with the column: Addr
	 */
	public java.lang.String getAddr () {
		return addr;
	}

	/**
	 * Set the value related to the column: Addr
	 * @param addr the Addr value
	 */
	public void setAddr (java.lang.String addr) {
		this.addr = addr;
	}



	/**
	 * Return the value associated with the column: ParentID
	 */
	public java.lang.Long getParentID () {
		return parentID;
	}

	/**
	 * Set the value related to the column: ParentID
	 * @param parentID the ParentID value
	 */
	public void setParentID (java.lang.Long parentID) {
		this.parentID = parentID;
	}



	/**
	 * Return the value associated with the column: Wspusers
	 */
	public java.util.Set<com.wifihi.persistance.Wspuser> getWspusers () {
		return wspusers;
	}

	/**
	 * Set the value related to the column: Wspusers
	 * @param wspusers the Wspusers value
	 */
	public void setWspusers (java.util.Set<com.wifihi.persistance.Wspuser> wspusers) {
		this.wspusers = wspusers;
	}

	public void addToWspusers (com.wifihi.persistance.Wspuser wspuser) {
		if (null == getWspusers()) setWspusers(new java.util.TreeSet<com.wifihi.persistance.Wspuser>());
		getWspusers().add(wspuser);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.Menu)) return false;
		else {
			com.wifihi.persistance.Menu menu = (com.wifihi.persistance.Menu) obj;
			if (null == this.getId() || null == menu.getId()) return false;
			else return (this.getId().equals(menu.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}