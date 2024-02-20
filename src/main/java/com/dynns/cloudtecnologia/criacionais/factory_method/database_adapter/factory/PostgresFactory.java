package com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.factory;


import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.DB;
import com.dynns.cloudtecnologia.criacionais.factory_method.database_adapter.db.PostgresDB;

public class PostgresFactory implements DBFactory {

    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }

}
