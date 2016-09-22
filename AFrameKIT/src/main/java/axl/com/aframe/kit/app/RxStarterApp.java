package axl.com.aframe.kit.app;

import axl.com.aframe.kit.account.AccountProvider;
import axl.com.aframe.kit.entity.Account;
import axl.com.aframe.ui.app.SupportApp;

public class RxStarterApp extends SupportApp implements AccountProvider {

  @Override public void onCreate() {
    super.onCreate();
  }

  @Override public Account provideAccount(String accountJson) {
    return null;
  }
}