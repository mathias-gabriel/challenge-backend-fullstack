package com.bankin.challengebackend.services;

import com.bankin.challengebackend.clients.GetAccountResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BridgeServiceTest {

    @Autowired
    private BridgeService bridgeService;

    @Test
    void Should_return_list_of_accounts() throws IOException {

            GetAccountResponse response = bridgeService.doSomething();
            assertThat(response).isNotNull();
            assertThat(response.accounts.size()).isGreaterThan(0);
    }
}
