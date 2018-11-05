package com.practice.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ユーザー登録フォーム。
 */
public class UserRegisterForm {

    @NotBlank
    @Size(max = 45)
    private String familyName;

    @NotBlank
    @Size(max = 45)
    private String givenName;

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

}
