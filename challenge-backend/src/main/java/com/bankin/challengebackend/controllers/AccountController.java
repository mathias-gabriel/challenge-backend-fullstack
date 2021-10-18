package com.bankin.challengebackend.controllers;

import java.io.IOException;

import com.bankin.challengebackend.clients.GetAccountResponse;
import com.bankin.challengebackend.dto.AccountsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankin.challengebackend.services.BridgeService;

/**
 * MyController.myEndpoint is called when requesting GET /mycontroller/myroute
 * <p>
 * You can try it by running curl -X GET localhost:8080/mycontroller/myroute
 * <p>
 * The BridgeClient has been injected and ready for use. Maybe the controller, method and route need some renaming?
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private BridgeService bridgeService;

    @GetMapping("/list")
    public AccountsDTO getAccounts() throws IOException {
        GetAccountResponse acounts = bridgeService.doSomething();
        return AccountsDTO.build(acounts.accounts);
    }

}
