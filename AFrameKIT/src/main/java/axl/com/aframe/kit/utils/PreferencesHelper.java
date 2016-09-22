package axl.com.aframe.kit.utils;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.SharedPreferencesCompat;

import axl.com.aframe.ui.app.SupportApp;

public enum PreferencesHelper {

  INSTANCE;

  private SharedPreferences preferences;

  PreferencesHelper() {
    preferences = PreferenceManager.getDefaultSharedPreferences(SupportApp.getInstance());
  }

  public int getVersionCode() {
    return preferences.getInt("version_code", -1);
  }

  public void setVersionCode(int versionCode) {
    SharedPreferences.Editor editor = preferences.edit();
    editor.putInt("version_code", versionCode);
    SharedPreferencesCompat.EditorCompat.getInstance().apply(editor);
  }

}