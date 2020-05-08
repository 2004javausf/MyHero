package com.revature.dao;

import java.sql.SQLException;

public interface BearDAO {
	
	public void createBear( int bear_type_id, String bear_name, String  bear_birthdate, int cave_id) throws SQLException;

}
