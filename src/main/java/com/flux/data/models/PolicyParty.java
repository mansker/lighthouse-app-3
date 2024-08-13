package com.flux.data.models;

import com.flux.data.BaseEntity;
import jakarta.persistence.Entity;

@Entity
public class PolicyParty extends BaseEntity {

    private Integer fk_policy;
    private Integer fk_party;
}
