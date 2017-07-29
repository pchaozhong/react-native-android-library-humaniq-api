package com.humaniq.apilib.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.humaniq.apilib.storage.Prefs;

/**
 * Created by ognev on 7/29/17.
 */

public class TokenModule extends ReactContextBaseJavaModule {

  public TokenModule(ReactApplicationContext reactContext) {
    super(reactContext);
    new Prefs(reactContext);
  }

  @Override public String getName() {
    return "HumaniqTokenApiLib";
  }

  @ReactMethod public void saveCredentials(
      String jwtToken, String accountId, Promise promise) {
    Prefs.saveJwtToken(jwtToken);
    Prefs.saveAccountId(accountId);
    WritableMap writableMap = new WritableNativeMap();
    writableMap.putString("status", "saved: " + Prefs.getJwtToken());
    promise.resolve(writableMap);
  }

  @ReactMethod public void getFCMToken(Promise promise) {
    WritableMap writableMap = new WritableNativeMap();
    writableMap.putString("token", Prefs.getFCMToken());
    promise.resolve(writableMap);
  }

  @ReactMethod public void getJwtToken(Promise promise) {
    WritableMap jwtMap = new WritableNativeMap();
    jwtMap.putString("token", Prefs.getJwtToken());
    promise.resolve(jwtMap);
  }
  @ReactMethod public void getAccountId(Promise promise) {
    WritableMap jwtMap = new WritableNativeMap();
    jwtMap.putString("token", Prefs.getAccountId());
    promise.resolve(jwtMap);
  }
}
