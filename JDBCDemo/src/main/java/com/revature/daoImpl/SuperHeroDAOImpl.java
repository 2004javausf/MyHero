package com.revature.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.reavture.util.ConnFactory;
import com.revature.dao.SuperHeroDAO;

public class SuperHeroDAOImpl implements SuperHeroDAO {
	public static ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createSuperHero(String heroName) throws SQLException {
		
		Connection conn = cf.getConnection();
		String sql = "{call INSERTSUPERHERO(?)";
		CallableStatement call  = conn.prepareCall(sql);
		call.setString(1, heroName);
		call.execute();
		
	}

}
