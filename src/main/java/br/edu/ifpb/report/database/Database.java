package br.edu.ifpb.report.database;

public interface Database {
    void createConnection();
    void runQuery(String query);
}
