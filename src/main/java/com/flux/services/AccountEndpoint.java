package com.flux.services;

import com.flux.data.models.Account;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.exception.EndpointException;
import java.util.Optional;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Endpoint
@AnonymousAllowed
public class AccountEndpoint {

    private final AccountService service;

    public AccountEndpoint(AccountService service) {
        this.service = service;
    }

    public Page<Account> list(Pageable page) {
        return service.list(page);
    }

    public Optional<Account> get(Long id) {
        return service.get(id);
    }

    public Account update(Account entity) {
        try {
            return service.update(entity);
        } catch (OptimisticLockingFailureException e) {
            throw new EndpointException("Somebody else has updated the data while you were making changes.");
        }
    }

    public void delete(Long id) {
        service.delete(id);
    }

    public int count() {
        return service.count();
    }

}
