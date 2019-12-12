package com.autoecole.kada.repository;

import org.hibernate.Hibernate;
import org.hibernate.dialect.Dialect;

import java.sql.Types;

public class SQLiteDialect extends Dialect {
//    Hibernate doesn't ship with a Dialect for SQLite. We need to create one ourselves.
    public SQLiteDialect() {
        registerColumnType(Types.BIT, "integer");
        registerColumnType(Types.TINYINT, "tinyint");
        registerColumnType(Types.SMALLINT, "smallint");
        registerColumnType(Types.INTEGER, "integer");
       //other data types
    }
}
