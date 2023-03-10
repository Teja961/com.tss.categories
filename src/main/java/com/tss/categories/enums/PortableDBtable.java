package com.tss.categories.enums;

public enum PortableDBtable {

    HOUSEHOLD_ACCOUNT_ACCESS("household_account_access", PortableDBSchema.CLIENT.getSchemaName()),

    USER_DETAILS("user_details", PortableDBSchema.CLIENT.getSchemaName());

    private final String tableName;
    private final String schemaName;

    PortableDBtable(final String tableName, String schemaName) {
        this.tableName = tableName;
        this.schemaName = schemaName;
    }


    public String getTableName(){
        return this.schemaName + "." + this.tableName;
    }
}
