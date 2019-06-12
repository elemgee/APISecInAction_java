package com.manning.apisecurityinaction;

import java.nio.file.*;
import java.sql.*;
import java.util.List;
import java.util.ListIterator;


import org.h2.jdbcx.*;
import org.json.*;


public class Main {
    public static void main(String[] args) throws Exception {


        System.out.println("API Security in Action\n(using Akka-HTTP for Java instead of Spray.io)");

        JdbcConnectionPool datasource = JdbcConnectionPool.create("jdbc:h2:mem:natter", "natter", "password");
        createTables(datasource.getConnection());

        System.out.println("Java demo complete");

    }


    private static void createTables(Connection connection) throws Exception {
        try {
            Connection conn = connection;
            Statement stmt = conn.createStatement();
            conn.setAutoCommit(false);
            Path path = Paths.get(Main.class.getResource("/schema.sql").toURI());
            // modification because I'm using Java 8 on this instead of 11
            List<String> lines = Files.readAllLines(path);
            StringBuffer joined = new StringBuffer();
            ListIterator<String> li = lines.listIterator();
            while (li.hasNext()) {
                joined.append(li.next());
                joined.append("\n");
            }
            stmt.execute(joined.toString());
            conn.commit();
            System.out.println("database initialized");
        } catch (Exception x) {
            System.err.println(x.getMessage());
            x.printStackTrace();
            throw (x);
        }
    }
}
