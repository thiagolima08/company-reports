package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements Database {

    public void createConnection() {
        System.out.println("Create mysql connetion");
    }

    public void runQuery(String query) {
        System.out.println("Run SQL query");
    }

}
