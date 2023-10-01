package org.example;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;

import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Jdbi jdbi = Jdbi.create("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "fdpgsp2425SS");

        try (Handle handle = jdbi.open()) {


            List<User> users = handle.createQuery("select * from users").mapToBean(User.class).list();

            for (User user : users){
                System.out.println(user.getName());
            }
        }


    }
}