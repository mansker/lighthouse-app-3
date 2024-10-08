package com.flux.data.repositories;


import com.flux.data.SamplePerson;
import com.flux.data.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountRepository
        extends
            JpaRepository<Account, Long>,
            JpaSpecificationExecutor<Account> {

}
