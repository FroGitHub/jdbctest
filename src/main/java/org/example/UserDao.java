package org.example;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;


public interface UserDao {

    @SqlUpdate("insert into users (name) values (:name)")
    void addUser(@Bind("name") String name);

}
