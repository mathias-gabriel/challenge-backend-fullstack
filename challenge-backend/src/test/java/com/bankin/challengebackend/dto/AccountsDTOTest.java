package com.bankin.challengebackend.controllers;

import com.bankin.challengebackend.clients.Account;
import com.bankin.challengebackend.dto.AccountsDTO;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class AccountsDTOTest {

    @Test
    void should_be_able_to_calculate_the_sum_of_the_accounts() throws IOException {

        Account account1= new Account();
        account1.balance = 123333.0;

        Account account2= new Account();
        account2.balance = 53045.0;

        Arrays.asList(account1, account2);

        AccountsDTO response = AccountsDTO.build(Arrays.asList(account1, account2));
        assertThat(response).isNotNull();
        assertThat(response.sum).isEqualTo(176400.0);
    }
}
