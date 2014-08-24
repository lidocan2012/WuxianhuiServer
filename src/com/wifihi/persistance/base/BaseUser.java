package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the user table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="user"
 */

public abstract class BaseUser  implements Serializable {

	public static String REF = "User";
	public static String PROP_REGISTRATE_TIME = "RegistrateTime";
	public static String PROP_PASSWORD = "Password";
	public static String PROP_Q_Q_NUMBER = "QQNumber";
	public static String PROP_ID = "Id";
	public static String PROP_USER_NAME = "UserName";
	public static String PROP_PHONE_NUMBER = "PhoneNumber";
	public static String PROP_REGISTRATE_DATE = "RegistrateDate";


	// constructors
	public BaseUser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseUser (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseUser (
		java.lang.Long id,
		java.lang.String phoneNumber) {

		this.setId(id);
		this.setPhoneNumber(phoneNumber);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.String phoneNumber;
	private java.lang.Long qQNumber;
	private java.lang.String userName;
	private java.util.Date registrateDate;
	private java.util.Date registrateTime;
	private java.lang.String password;

	// collections
	private java.util.Set<com.wifihi.persistance.Uservisitingsystemhistory> uservisitingsystemhistories;
	private java.util.Set<com.wifihi.persistance.Ordermanage> ordermanages;
	private java.util.Set<com.wifihi.persistance.Userwifivisitinghistory> userwifivisitinghistories;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="UserID"
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
	 * Return the value associated with the column: PhoneNumber
	 */
	public java.lang.String getPhoneNumber () {
		return phoneNumber;
	}

	/**
	 * Set the value related to the column: PhoneNumber
	 * @param phoneNumber the PhoneNumber value
	 */
	public void setPhoneNumber (java.lang.String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	/**
	 * Return the value associated with the column: QQNumber
	 */
	public java.lang.Long getQQNumber () {
		return qQNumber;
	}

	/**
	 * Set the value related to the column: QQNumber
	 * @param qQNumber the QQNumber value
	 */
	public void setQQNumber (java.lang.Long qQNumber) {
		this.qQNumber = qQNumber;
	}



	/**
	 * Return the value associated with the column: UserName
	 */
	public java.lang.String getUserName () {
		return userName;
	}

	/**
	 * Set the value related to the column: UserName
	 * @param userName the UserName value
	 */
	public void setUserName (java.lang.String userName) {
		this.userName = userName;
	}



	/**
	 * Return the value associated with the column: RegistrateDate
	 */
	public java.util.Date getRegistrateDate () {
		return registrateDate;
	}

	/**
	 * Set the value related to the column: RegistrateDate
	 * @param registrateDate the RegistrateDate value
	 */
	public void setRegistrateDate (java.util.Date registrateDate) {
		this.registrateDate = registrateDate;
	}



	/**
	 * Return the value associated with the column: RegistrateTime
	 */
	public java.util.Date getRegistrateTime () {
		return registrateTime;
	}

	/**
	 * Set the value related to the column: RegistrateTime
	 * @param registrateTime the RegistrateTime value
	 */
	public void setRegistrateTime (java.util.Date registrateTime) {
		this.registrateTime = registrateTime;
	}



	/**
	 * Return the value associated with the column: Password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: Password
	 * @param password the Password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: Uservisitingsystemhistories
	 */
	public java.util.Set<com.wifihi.persistance.Uservisitingsystemhistory> getUservisitingsystemhistories () {
		return uservisitingsystemhistories;
	}

	/**
	 * Set the value related to the column: Uservisitingsystemhistories
	 * @param uservisitingsystemhistories the Uservisitingsystemhistories value
	 */
	public void setUservisitingsystemhistories (java.util.Set<com.wifihi.persistance.Uservisitingsystemhistory> uservisitingsystemhistories) {
		this.uservisitingsystemhistories = uservisitingsystemhistories;
	}

	public void addToUservisitingsystemhistories (com.wifihi.persistance.Uservisitingsystemhistory uservisitingsystemhistory) {
		if (null == getUservisitingsystemhistories()) setUservisitingsystemhistories(new java.util.TreeSet<com.wifihi.persistance.Uservisitingsystemhistory>());
		getUservisitingsystemhistories().add(uservisitingsystemhistory);
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



	/**
	 * Return the value associated with the column: Userwifivisitinghistories
	 */
	public java.util.Set<com.wifihi.persistance.Userwifivisitinghistory> getUserwifivisitinghistories () {
		return userwifivisitinghistories;
	}

	/**
	 * Set the value related to the column: Userwifivisitinghistories
	 * @param userwifivisitinghistories the Userwifivisitinghistories value
	 */
	public void setUserwifivisitinghistories (java.util.Set<com.wifihi.persistance.Userwifivisitinghistory> userwifivisitinghistories) {
		this.userwifivisitinghistories = userwifivisitinghistories;
	}

	public void addToUserwifivisitinghistories (com.wifihi.persistance.Userwifivisitinghistory userwifivisitinghistory) {
		if (null == getUserwifivisitinghistories()) setUserwifivisitinghistories(new java.util.TreeSet<com.wifihi.persistance.Userwifivisitinghistory>());
		getUserwifivisitinghistories().add(userwifivisitinghistory);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.User)) return false;
		else {
			com.wifihi.persistance.User user = (com.wifihi.persistance.User) obj;
			if (null == this.getId() || null == user.getId()) return false;
			else return (this.getId().equals(user.getId()));
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