package com.flux.data.models;

import jakarta.persistence.Entity;
import com.flux.data.BaseEntity;

@Entity
public class AccountParty extends BaseEntity {
    private Integer fk_AccountID;
    private Integer fk_PartyID;
}
