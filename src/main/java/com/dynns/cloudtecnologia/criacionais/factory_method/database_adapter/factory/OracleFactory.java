package com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.factory;


import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.DB;
import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
