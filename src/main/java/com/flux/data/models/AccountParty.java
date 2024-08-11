package com.flux.data.models;

import jakarta.persistence.Entity;
import com.flux.data.AbstractEntity;

@Entity
public class AccountParty extends AbstractEntity {
    private Integer fk_AccountID;
    private Integer fk_PartyID;
}
