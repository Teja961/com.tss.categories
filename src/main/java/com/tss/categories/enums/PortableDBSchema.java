package com.tss.categories.enums;

import lombok.Data;


public enum PortableDBSchema {

    CLIENT("\"CLIENT\"");


    private final String schemaName;

    public String getSchemaName() {
        return schemaName;
    }

    PortableDBSchema(final String schemaName) {
        this.schemaName = schemaName;


    }
}
