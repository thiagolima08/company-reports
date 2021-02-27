package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.Database;

public abstract class AbstractReport {

    public final void generate() {
        createDatabaseConnection();
        executeQuery();
        convertTo();
    }

    abstract Database getConnector();

    public abstract void createDatabaseConnection();

    public abstract void convertTo();

    public abstract void executeQuery();

}
