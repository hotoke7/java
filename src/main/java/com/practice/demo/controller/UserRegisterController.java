package com.practice.demo.controller;

import com.practice.demo.entity.User;
import com.practice.demo.form.UserRegisterForm;
import com.practice.demo.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ユーザー登録コントローラ。
 */
@Controller
@RequestMapping(value = "/user/register")
public class UserRegisterController {

    /** ユーザー登録サービス */
    private final UserRegisterService service;

    @Autowired
    public UserRegisterController(UserRegisterService userRegisterService) {
        this.service = userRegisterService;
    }

    /**
     * ユーザー登録-初期表示。
     *
     * @param userRegisterForm ユーザー登録フォーム
     * @return Path
     */
    @RequestMapping(value = "/init")
    public String registerInit(@ModelAttribute UserRegisterForm userRegisterForm) {
        return "userRegisterForm";
    }

    /**
     * ユーザー登録-確認画面表示。
     *
     * @param userRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String registerConfirm(@ModelAttribute @Validated UserRegisterForm userRegisterForm, BindingResult bindingResult) {
        // BeanValidationのエラー確認
        if (bindingResult.hasErrors()) {
            return "userRegisterForm";
        }
        return "userRegisterConfirmForm";
    }

    /**
     * ユーザー登録-完了画面表示。
     *
     * @param userRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/do", params = "register", method = RequestMethod.POST)
    public String registerComplete(@ModelAttribute @Validated UserRegisterForm userRegisterForm, BindingResult bindingResult, Model model) {
        // BeanValidationのエラー確認
        if (bindingResult.hasErrors()) {
            return "userRegisterForm";
        }
        // ユーザーの登録
        service.register(userRegisterForm);
        model.addAttribute("Key","ユーザー登録が完了しました。");
        return "userRegisterCompleteForm";
    }

    /**
     * ユーザー登録-入力画面に戻る。
     *
     * @param userRegisterForm ユーザー登録フォーム。
     * @return Path
     */
    @RequestMapping(value = "/do", params = "registerBack", method = RequestMethod.POST)
    public String registerBack(@ModelAttribute UserRegisterForm userRegisterForm) {
        return "userRegisterForm";
    }

}
