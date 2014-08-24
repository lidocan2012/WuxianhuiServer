package com.wifihi.persistance.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the goodstype table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="goodstype"
 */

public abstract class BaseGoodstype  implements Serializable {

	public static String REF = "Goodstype";
	public static String PROP_EXTENDS = "Extends";
	public static String PROP_GOODS_TYPE_DESCRIBE = "GoodsTypeDescribe";
	public static String PROP_ID = "Id";


	// constructors
	public BaseGoodstype () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGoodstype (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String goodsTypeDescribe;
	private java.lang.String m_extends;

	// collections
	private java.util.Set<com.wifihi.persistance.Goodsmanage> goodsmanages;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="GoodsType"
     */
	public java.lang.String getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: GoodsTypeDescribe
	 */
	public java.lang.String getGoodsTypeDescribe () {
		return goodsTypeDescribe;
	}

	/**
	 * Set the value related to the column: GoodsTypeDescribe
	 * @param goodsTypeDescribe the GoodsTypeDescribe value
	 */
	public void setGoodsTypeDescribe (java.lang.String goodsTypeDescribe) {
		this.goodsTypeDescribe = goodsTypeDescribe;
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
		if (!(obj instanceof com.wifihi.persistance.Goodstype)) return false;
		else {
			com.wifihi.persistance.Goodstype goodstype = (com.wifihi.persistance.Goodstype) obj;
			if (null == this.getId() || null == goodstype.getId()) return false;
			else return (this.getId().equals(goodstype.getId()));
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