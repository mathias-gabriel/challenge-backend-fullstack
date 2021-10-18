package com.bankin.challengebackend.dto;

import com.bankin.challengebackend.clients.Account;

import java.util.List;

public class AccountsDTO {
    public double sum;
    public List<Account> accounts;

    public static AccountsDTO build(List<Account> accounts){


        AccountsDTO accountsDTO = new AccountsDTO();
        double sum = accounts.stream().mapToDouble(a->a.balance).sum();
        //double rounded = Math.round(sum*100.0)/100.0;
        accountsDTO.sum = (Math.ceil(sum/100.0))*100.0;
        //accountsDTO.sum = sum;
        accountsDTO.accounts = accounts;

        return accountsDTO;
    }
}
