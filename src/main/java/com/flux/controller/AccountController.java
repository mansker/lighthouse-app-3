package com.flux.controller;

import com.flux.data.dto.AccountDto;
import com.flux.data.models.Account;
import com.flux.data.repositories.AccountRepository;
import com.flux.data.specification.AccountSpecification;
import com.flux.services.AccountService;
import org.atmosphere.config.service.Get;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountRepository accountRepository;
    private final AccountService accountService;

    public AccountController(AccountRepository accountRepository, AccountService accountService) {
        this.accountRepository = accountRepository;
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public Iterable<Account> findAllAccounts() {
        return this.accountRepository.findAll();
    }

    @PostMapping("/accounts")
    public Account addOneAccount(@RequestBody Account account) {
        return this.accountRepository.save(account);
    }

//    @GetMapping("/account?/lastname=${lastname}")
//    public List<AccountDto> getAccountsByLastName(@PathVariable("lastname") String lastname) {
//        return accountService.getAllAccountsByLastname("last_name", lastname);
//    }
}
