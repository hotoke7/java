package com.practice.demo.controller;

import com.practice.demo.entity.User;
import com.practice.demo.form.UserRegisterForm;
import com.practice.demo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ユーザ登録コントローラ。
 */
@Controller
@RequestMapping(value = "/user/register")
public class UserRegisterController {

    /** ユーザ登録サービス */
    private final UserRegisterService service;

    @Autowired
    public UserRegisterController(UserRegisterService userRegisterService) {
        this.service = userRegisterService;
    }

    /**
     * ユーザ登録-初期表示。
     *
     * @param userRegisterForm ユーザ登録フォーム
     * @return Path
     */
    @RequestMapping(value = "/init")
    String registerInit(@ModelAttribute UserRegisterForm userRegisterForm) {
        return "user/userRegisterForm";
    }

    /**
     * ユーザ登録-確認画面表示。
     *
     * @param userRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    String registerConfirm(@ModelAttribute @Validated UserRegisterForm userRegisterForm) {
        return "user/userRegisterConfirmForm";
    }

    /**
     * ユーザ登録-完了画面表示。
     *
     * @param userRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/do", params = "register", method = RequestMethod.POST)
    String registerComplete(@ModelAttribute @Validated UserRegisterForm userRegisterForm) {
        // 登録するユーザの作成
        User user = new User();
        user.setName(userRegisterForm.getName());
        // ユーザの登録
        service.register(user);
        return "user/userRegisterCompleteForm";
    }

    /**
     * ユーザ登録-入力画面に戻る。
     *
     * @param userRegisterForm ユーザ登録フォーム。
     * @return Path
     */
    @RequestMapping(value = "/do", params = "registerBack", method = RequestMethod.POST)
    String registerBack(@ModelAttribute UserRegisterForm userRegisterForm) {
        return "user/userRegisterForm";
    }

}
