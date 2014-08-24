package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the wspuservisithistory table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="wspuservisithistory"
 */

public abstract class BaseWspuservisithistory  implements Serializable {

	public static String REF = "Wspuservisithistory";
	public static String PROP_W_S_P_VISITING_DATE = "WSPVisitingDate";
	public static String PROP_DISTRICT = "District";
	public static String PROP_W_S_P_VISITING_TIME = "WSPVisitingTime";
	public static String PROP_ID = "Id";
	public static String PROP_W_S_P_USER = "WSPUser";
	public static String PROP_PROVINCE = "Province";
	public static String PROP_COUNTRY = "Country";
	public static String PROP_CITY = "City";


	// constructors
	public BaseWspuservisithistory () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseWspuservisithistory (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.util.Date wSPVisitingDate;
	private java.util.Date wSPVisitingTime;
	private java.lang.String country;
	private java.lang.String province;
	private java.lang.String city;
	private java.lang.String district;

	// many to one
	private com.wifihi.persistance.Wspuser wSPUser;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="WSPVisitingID"
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
	 * Return the value associated with the column: WSPVisitingDate
	 */
	public java.util.Date getWSPVisitingDate () {
		return wSPVisitingDate;
	}

	/**
	 * Set the value related to the column: WSPVisitingDate
	 * @param wSPVisitingDate the WSPVisitingDate value
	 */
	public void setWSPVisitingDate (java.util.Date wSPVisitingDate) {
		this.wSPVisitingDate = wSPVisitingDate;
	}



	/**
	 * Return the value associated with the column: WSPVisitingTime
	 */
	public java.util.Date getWSPVisitingTime () {
		return wSPVisitingTime;
	}

	/**
	 * Set the value related to the column: WSPVisitingTime
	 * @param wSPVisitingTime the WSPVisitingTime value
	 */
	public void setWSPVisitingTime (java.util.Date wSPVisitingTime) {
		this.wSPVisitingTime = wSPVisitingTime;
	}



	/**
	 * Return the value associated with the column: Country
	 */
	public java.lang.String getCountry () {
		return country;
	}

	/**
	 * Set the value related to the column: Country
	 * @param country the Country value
	 */
	public void setCountry (java.lang.String country) {
		this.country = country;
	}



	/**
	 * Return the value associated with the column: Province
	 */
	public java.lang.String getProvince () {
		return province;
	}

	/**
	 * Set the value related to the column: Province
	 * @param province the Province value
	 */
	public void setProvince (java.lang.String province) {
		this.province = province;
	}



	/**
	 * Return the value associated with the column: City
	 */
	public java.lang.String getCity () {
		return city;
	}

	/**
	 * Set the value related to the column: City
	 * @param city the City value
	 */
	public void setCity (java.lang.String city) {
		this.city = city;
	}



	/**
	 * Return the value associated with the column: District
	 */
	public java.lang.String getDistrict () {
		return district;
	}

	/**
	 * Set the value related to the column: District
	 * @param district the District value
	 */
	public void setDistrict (java.lang.String district) {
		this.district = district;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.Wspuservisithistory)) return false;
		else {
			com.wifihi.persistance.Wspuservisithistory wspuservisithistory = (com.wifihi.persistance.Wspuservisithistory) obj;
			if (null == this.getId() || null == wspuservisithistory.getId()) return false;
			else return (this.getId().equals(wspuservisithistory.getId()));
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