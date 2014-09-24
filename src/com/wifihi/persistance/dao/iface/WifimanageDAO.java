package com.wifihi.persistance.dao.iface;

import java.io.Serializable;

public interface WifimanageDAO {
	public com.wifihi.persistance.Wifimanage get(java.lang.Long key);

	public com.wifihi.persistance.Wifimanage load(java.lang.Long key);

	public java.util.List<com.wifihi.persistance.Wifimanage> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param wifimanage a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.wifihi.persistance.Wifimanage wifimanage);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param wifimanage a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.wifihi.persistance.Wifimanage wifimanage);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param wifimanage a transient instance containing updated state
	 */
	public void update(com.wifihi.persistance.Wifimanage wifimanage);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Long id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param wifimanage the instance to be removed
	 */
	public void delete(com.wifihi.persistance.Wifimanage wifimanage);


}