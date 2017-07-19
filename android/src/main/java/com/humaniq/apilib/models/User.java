package com.humaniq.apilib.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ognev on 7/19/17.
 */

class User {

  @SerializedName("account_id")
  private String accountId;

  @SerializedName("name")
  private User.Name name;

  @SerializedName("profile_photo")
  private User.ProfilePhoto profilePhoto;

  @SerializedName("phone_number")
  private User.PhoneNumber phoneNumber;

  public String getAccountId() {
    return accountId;
  }

  public Name getName() {
    return name;
  }

  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public ProfilePhoto getProfilePhoto() {
    return profilePhoto;
  }


  private class Name {
    @SerializedName("first_name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    public String getFirstName() {
      return firstName;
    }

    public String getLastName() {
      return lastName;
    }
  }

  private class ProfilePhoto {
    @SerializedName("url")
    private String url;

    @SerializedName("expiry")
    private String expiry;

    public String getUrl() {
      return url;
    }

    public String getExpiry() {
      return expiry;
    }
  }

  private class PhoneNumber {
    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("phone_number")
    private String phoneNumber;

    public String getCountryCode() {
      return countryCode;
    }

    public String getPhoneNumber() {
      return phoneNumber;
    }
  }
}
