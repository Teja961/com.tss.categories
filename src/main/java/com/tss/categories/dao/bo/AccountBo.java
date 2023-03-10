package com.tss.categories.dao.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AccountBo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer household_account_id;
    private Integer client_id;
    private Integer account_id;
    private String status;
    private Date created_dt;
    private String created_by;
    private Date modified_dt;
    private String modified_by;

    public static final class Builder {
        private Integer household_account_id;
        private Integer client_id;
        private Integer account_id;
        private String status;
        private Date created_dt;
        private String created_by;
        private Date modified_dt;
        private String modified_by;

        public Builder() {
        }

        public Builder withHousehold_account_id(Integer val) {
            household_account_id = val;
            return this;
        }

        public Builder withClient_id(Integer val) {
            client_id = val;
            return this;
        }

        public Builder withAccount_id(Integer val) {
            account_id = val;
            return this;
        }

        public Builder withStatus(String val) {
            status = val;
            return this;
        }

        public Builder withCreated_dt(Date val) {
            created_dt = val;
            return this;
        }

        public Builder withCreated_by(String val) {
            created_by = val;
            return this;
        }

        public Builder withModified_dt(Date val) {
            modified_dt = val;
            return this;
        }

        public Builder withModified_by(String val) {
            modified_by = val;
            return this;
        }

        public AccountBo build() {
            return new AccountBo();
        }
    }
}
