package com.flux.data.specification;

import com.flux.data.models.Account;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecification {

    private AccountSpecification() {};

    public static Specification<Account> stringLike(String fieldName, String stringLike) {
        return (root, query, builder) -> builder.like(root.get(fieldName), "%" + stringLike + "%");
    }
}
