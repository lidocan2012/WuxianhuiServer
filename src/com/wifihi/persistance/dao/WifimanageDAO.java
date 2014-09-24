package com.wifihi.persistance.dao;

import org.hibernate.Session;

import com.wifihi.persistance.base.BaseWifimanageDAO;


public class WifimanageDAO extends BaseWifimanageDAO implements com.wifihi.persistance.dao.iface.WifimanageDAO {

	public WifimanageDAO () {}
	
	public WifimanageDAO (Session session) {
		super(session);
	}


}