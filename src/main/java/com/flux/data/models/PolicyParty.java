package com.flux.data.models;

import com.flux.data.AbstractEntity;
import jakarta.persistence.Entity;

@Entity
public class PolicyParty extends AbstractEntity {

    private Integer fk_policy;
    private Integer fk_party;
}
