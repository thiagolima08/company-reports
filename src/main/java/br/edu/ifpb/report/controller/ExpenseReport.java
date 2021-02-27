package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends AbstractReport {


//    public void generate() {
//        createDatabaseConnection();
//        executePostgresQuery();
//        convertToXLS();
//    }

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        getConnector().createConnection();
    }

    @Override
    public PostgreSQLDatabaseConnector getConnector(){
        return new PostgreSQLDatabaseConnector();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing Postgres Query...");
        String query = "SELECT * FROM expenses";
        getConnector().runQuery(query);
    }
//    public void executePostgresQuery() {
//        System.out.println("Executing Postgres Query...");
//        String query = "SELECT * FROM expenses";
//        connector.runQuery(query);
//    }

    @Override
    public void convertTo() {
        System.out.println("Converting To XLS...");
    }

//    public void convertToXLS() {
//        System.out.println("Converting To XLS...");
//    }

}
