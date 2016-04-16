package io.keepcoding.rgs.besaveeating.model;

import java.util.LinkedList;

/**
 * Created by RamiroGarcia on 16/4/16.
 */
public class Restaurant {

    LinkedList<Table> tables;

    public Restaurant() {
        this.tables = new LinkedList<Table> ();
    }

    public LinkedList<Table> getTables() {
        return tables;
    }

    public void setTables(LinkedList<Table> tables) {
        this.tables = tables;
    }

    public int getNumTables(){
        return tables.size();
    }
}
