package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the orderdetail table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="orderdetail"
 */

public abstract class BaseOrderdetail  implements Serializable {

	public static String REF = "Orderdetail";
	public static String PROP_GOODS_I_D = "GoodsID";
	public static String PROP_NUMBER = "Number";
	public static String PROP_ORDER = "Order";
	public static String PROP_ID = "Id";
	public static String PROP_W_S_P_USER = "WSPUser";


	// constructors
	public BaseOrderdetail () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseOrderdetail (java.lang.Long id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseOrderdetail (
		java.lang.Long id,
		java.lang.Integer number) {

		this.setId(id);
		this.setNumber(number);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long id;

	// fields
	private java.lang.Integer number;

	// many to one
	private com.wifihi.persistance.Goodsmanage goodsID;
	private com.wifihi.persistance.Ordermanage order;
	private com.wifihi.persistance.Wspuser wSPUser;

	// collections
	private java.util.Set<com.wifihi.persistance.Goodsmanage> goodsmanages;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="DetailID"
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
	 * Return the value associated with the column: Number
	 */
	public java.lang.Integer getNumber () {
		return number;
	}

	/**
	 * Set the value related to the column: Number
	 * @param number the Number value
	 */
	public void setNumber (java.lang.Integer number) {
		this.number = number;
	}



	/**
	 * Return the value associated with the column: GoodsID
	 */
	public com.wifihi.persistance.Goodsmanage getGoodsID () {
		return goodsID;
	}

	/**
	 * Set the value related to the column: GoodsID
	 * @param goodsID the GoodsID value
	 */
	public void setGoodsID (com.wifihi.persistance.Goodsmanage goodsID) {
		this.goodsID = goodsID;
	}



	/**
	 * Return the value associated with the column: OrderId
	 */
	public com.wifihi.persistance.Ordermanage getOrder () {
		return order;
	}

	/**
	 * Set the value related to the column: OrderId
	 * @param order the OrderId value
	 */
	public void setOrder (com.wifihi.persistance.Ordermanage order) {
		this.order = order;
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
	 * Return the value associated with the column: Goodsmanages
	 */
	public java.util.Set<com.wifihi.persistance.Goodsmanage> getGoodsmanages () {
		return goodsmanages;
	}

	/**
	 * Set the value related to the column: Goodsmanages
	 * @param goodsmanages the Goodsmanages value
	 */
	public void setGoodsmanages (java.util.Set<com.wifihi.persistance.Goodsmanage> goodsmanages) {
		this.goodsmanages = goodsmanages;
	}

	public void addToGoodsmanages (com.wifihi.persistance.Goodsmanage goodsmanage) {
		if (null == getGoodsmanages()) setGoodsmanages(new java.util.TreeSet<com.wifihi.persistance.Goodsmanage>());
		getGoodsmanages().add(goodsmanage);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.wifihi.persistance.Orderdetail)) return false;
		else {
			com.wifihi.persistance.Orderdetail orderdetail = (com.wifihi.persistance.Orderdetail) obj;
			if (null == this.getId() || null == orderdetail.getId()) return false;
			else return (this.getId().equals(orderdetail.getId()));
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