package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.reavture.util.ConnFactory;
import com.revature.dao.PowersDAO;

public class PowersDAOImpl implements PowersDAO {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void createPowers(String name) throws SQLException {
		//PREPARED STATMENT - pre compiled - compiled in JAVA/ Statement is compiled in SQL
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO POWERS VALUES(POWSEQ.NEXTVAL, ?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.executeUpdate();
		
	}

}
