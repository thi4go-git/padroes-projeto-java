package com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.factory;


import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.DB;

public interface DBFactory {
	DB getDatabase();
}
