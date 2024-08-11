package com.flux.services;

import java.util.Optional;

import com.flux.data.models.Account;
import com.flux.data.repositories.AccountRepository;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.ListRepositoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@BrowserCallable
@AnonymousAllowed
@Service
public class AccountService extends ListRepositoryService<Account, Long, AccountRepository> {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Optional<Account> get(Long id) {
        return repository.findById(id);
    }

    public Account update(Account entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Account> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Account> list(Pageable pageable, Specification<Account> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
