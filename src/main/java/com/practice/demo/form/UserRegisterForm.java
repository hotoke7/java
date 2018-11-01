package com.practice.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ユーザ登録フォーム。
 */
public class UserRegisterForm {

    @NotBlank
    @Size(max = 45, message = "{error.size.max}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
