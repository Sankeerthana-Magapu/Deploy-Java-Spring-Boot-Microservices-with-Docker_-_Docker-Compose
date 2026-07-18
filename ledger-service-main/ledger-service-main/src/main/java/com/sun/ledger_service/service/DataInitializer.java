package com.sun.ledger_service.service;

import com.sun.ledger_service.models.Account;
import com.sun.ledger_service.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@RequiredArgsConstructor
public class DataInitializer {

    private final AccountRepository accountRepository;

    @Bean
    CommandLineRunner initAccounts() {
        return args -> {
            if (accountRepository.count() == 0) {

                accountRepository.save(Account.builder()
                        .balance(new BigDecimal("1000"))
                        .version(0L)
                        .build());

                accountRepository.save(Account.builder()
                        .balance(new BigDecimal("1000"))
                        .version(0L)
                        .build());

                accountRepository.save(Account.builder()
                        .balance(new BigDecimal("1000"))
                        .version(0L)
                        .build());

                System.out.println("Created 3 sample accounts.");
            }
        };
    }
}