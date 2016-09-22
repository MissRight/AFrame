package axl.com.aframe.kit.account;


import axl.com.aframe.kit.entity.Account;

public interface AccountProvider {
  Account provideAccount(String accountJson);
}