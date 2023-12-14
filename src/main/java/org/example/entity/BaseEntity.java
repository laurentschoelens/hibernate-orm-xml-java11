/*
 * Project: EGDX
 *
 * Copyright 2018-2023 by Canton de Vaud
 * All rights reserved.
 *
 *
 * This software is the confidential and proprietary information
 * of Canton de Vaud. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license
 * agreement you entered into with Canton de Vaud.
 */

package org.example.entity;

import javax.validation.constraints.Size;


/**
 * Entity class for Base.
 * 
 */
public class BaseEntity {

    protected String createdBy;
    protected String lastModifiedBy;

    @Size(max = 4)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Size(max = 4)
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

}
