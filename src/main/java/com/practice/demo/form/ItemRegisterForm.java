package com.practice.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * ユーザー登録フォーム。
 */
public class ItemRegisterForm {

    @NotBlank
    @Size(max = 45)
    private String name;

    @NotBlank
    @Size(max = 10)
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
