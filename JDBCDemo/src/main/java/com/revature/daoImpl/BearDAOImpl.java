package com.revature.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.reavture.util.ConnFactory;
import com.revature.dao.BearDAO;

public class BearDAOImpl implements BearDAO {
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createBear(int bear_type_id, String bear_name, String bear_birthdate,int cave_id) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{ call BEARPRO(?,?,?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setInt(1,cave_id);
		call.setString(2,bear_name);
		call.setString(3,bear_birthdate);
		call.setInt(4,bear_type_id);
		call.execute();
		
		
	}

}
