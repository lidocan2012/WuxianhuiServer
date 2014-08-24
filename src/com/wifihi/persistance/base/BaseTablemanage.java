package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the tablemanage table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="tablemanage"
 */

public abstract class BaseTablemanage  implements Serializable {

	public static String REF = "Tablemanage";
	public static String PROP_EXTENDS = "Extends";
	public static String PROP_ID = "Id";
	public static String PROP_W_S_P_USER = "WSPUser";


	// constructors
	public BaseTablemanage () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTablemanage (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String m_extends;

	// many to one
	private com.wifihi.persistance.Wspuser wSPUser;

	// collections
	private java.util.Set<com.wifihi.persistance.Ordermanage> ordermanages;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="TableID"
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
	 * Return the value associated with the column: Extends
	 */
	public java.lang.String getExtends () {
		return m_extends;
	}

	/**
	 * Set the value related to the column: Extends
	 * @param m_extends the Extends value
	 */
	public void setExtends (java.lang.String m_extends) {
		this.m_extends = m_extends;
	}



	/**
	 * Return the value associated with the column: WSPUser
	 */
	public com.wifihi.persistance.Wspuser getWSPUser () {
		return wSPUser;
	}

	/**
	 * Set the value related to the column: WSPUser
	 * @param wSPUser the WSPUser value
	 */
	public void setWSPUser (com.wifihi.persistance.Wspuser wSPUser) {
		this.wSPUser = wSPUser;
	}



	/**
	 * Return the value associated with the column: Ordermanages
	 */
	public java.util.Set<com.wifihi.persistance.Ordermanage> getOrdermanages () {
		return ordermanages;
	}

	/**
	 * Set the value related to the column: Ordermanages
	 * @param ordermanages the Ordermanages value
	 */
	public void setOrdermanages (java.util.Set<com.wifihi.persistance.Ordermanage> ordermanages) {
		this.ordermanages = ordermanages;
	}

	public void addToOrdermanages (com.wifihi.persistance.Ordermanage ordermanage) {
		if (null == getOrdermanages()) setOrdermanages(new java.util.TreeSet<com.wifihi.persistance.Ordermanage>());
		getOrdermanages().add(ordermanage);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.Tablemanage)) return false;
		else {
			com.wifihi.persistance.Tablemanage tablemanage = (com.wifihi.persistance.Tablemanage) obj;
			if (null == this.getId() || null == tablemanage.getId()) return false;
			else return (this.getId().equals(tablemanage.getId()));
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