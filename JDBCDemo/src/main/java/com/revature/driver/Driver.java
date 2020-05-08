package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoImpl.*;

public class Driver {
	
	public static void main(String[] args) {
		StudentDAOImpl sdi = new StudentDAOImpl();
		PowersDAOImpl pdi = new PowersDAOImpl();
		SuperHeroDAOImpl shdi = new SuperHeroDAOImpl();
		BearDAOImpl bear = new BearDAOImpl();
		try {
			//sdi.insertStudent(1, "Jordan", 1);
			//System.out.println(sdi.getStudentList());
//			pdi.createPowers("Materializaton");
//			shdi.createSuperHero("The Dark Knight");
			bear.createBear(1, "Jensen", "02-MAY-2013", 1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
