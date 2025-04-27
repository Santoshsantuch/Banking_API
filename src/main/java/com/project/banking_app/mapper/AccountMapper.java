package com.project.banking_app.mapper;

import com.project.banking_app.dto.AccountDto;
import com.project.banking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()
        );

        return account;
    }


    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
