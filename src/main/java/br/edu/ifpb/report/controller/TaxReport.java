package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends AbstractReport {

//    public void generate() {
//        createDatabaseConnection();
//        executeMySQLQuery();
//        convertToPDF();
//    }

    @Override
    public void createDatabaseConnection() {
        System.out.println("Creating Database Connection...");
        getConnector().createConnection();
    }

    @Override
    public MysqlDatabaseConnector getConnector(){
        return new MysqlDatabaseConnector();
    }

    @Override
    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        getConnector().runQuery(query);
    }

//    public void executeMySQLQuery() {
//        System.out.println("Executing MySQL Query...");
//        String query = "SELECT * FROM taxes";
//        connector.executeQuery(query);
//    }

    @Override
    public void convertTo() {
        System.out.println("Converting To PDF...");
    }

//    public void convertToPDF() {
//        System.out.println("Converting To PDF...");
//    }
}
