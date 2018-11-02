package com.practice.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ユーザー登録フォーム。
 */
public class UserRegisterForm {

    @NotBlank
    @Size(max = 45, message = "{error.size.max}")
    private String fmailyName;

    @NotBlank
    @Size(max = 45, message = "{error.size.max}")
    private String givenName;

    public String getFmailyName() {
        return fmailyName;
    }

    public void setFmailyName(String fmailyName) {
        this.fmailyName = fmailyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

}
