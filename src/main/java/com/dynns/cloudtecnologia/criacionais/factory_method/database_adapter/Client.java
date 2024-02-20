package com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter;


import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.DB;
import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
