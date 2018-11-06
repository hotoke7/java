package com.practice.demo.controller;

import com.practice.demo.entity.Item;
import com.practice.demo.form.ItemRegisterForm;
import com.practice.demo.service.ItemRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 商品登録コントローラ。
 */
@Controller
@RequestMapping(value = "/item/register")
public class ItemRegisterController {

    /** 商品登録サービス */
    private final ItemRegisterService service;

    @Autowired
    public ItemRegisterController(ItemRegisterService itemRegisterService) {
        this.service = itemRegisterService;
    }

    /**
     * 商品登録-初期表示。
     *
     * @param itemRegisterForm ユーザー登録フォーム
     * @return Path
     */
    @RequestMapping(value = "/init")
    public String registerInit(@ModelAttribute ItemRegisterForm itemRegisterForm) {
        return "itemRegisterForm";
    }

    /**
     * 商品登録-確認画面表示。
     *
     * @param itemRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String registerConfirm(@ModelAttribute @Validated ItemRegisterForm itemRegisterForm, BindingResult bindingResult, Model model) {
        // BeanValidationのエラー確認
        if (bindingResult.hasErrors()) {
            return "itemRegisterForm";
        }
        boolean result = service.validatePrice(itemRegisterForm.getPrice());
        if (!result) {
            model.addAttribute("errorMessage", "値段は数字で入力してください");
            return "itemRegisterForm";
        }
        return "itemRegisterConfirmForm";
    }

    /**
     * 商品登録-完了画面表示。
     *
     * @param itemRegisterForm 精査済みフォーム
     * @return Path
     */
    @RequestMapping(value = "/do", params = "register", method = RequestMethod.POST)
    public String registerComplete(@ModelAttribute @Validated ItemRegisterForm itemRegisterForm, BindingResult bindingResult, Model model) {
        // BeanValidationのエラー確認
        if (bindingResult.hasErrors()) {
            return "itemRegisterForm";
        }
        boolean result = service.validatePrice(itemRegisterForm.getPrice());
        if (!result) {
            model.addAttribute("errorMessage", "値段は数字で入力してください");
            return "itemRegisterForm";
        }
        Item item = service.createItem(itemRegisterForm);
        // 商品の登録
        service.register(item);
        model.addAttribute("completeMessage","商品登録が完了しました。");
        return "itemRegisterCompleteForm";
    }

    /**
     * 商品登録-入力画面に戻る。
     *
     * @param itemRegisterForm 商品登録フォーム。
     * @return Path
     */
    @RequestMapping(value = "/do", params = "registerBack", method = RequestMethod.POST)
    public String registerBack(@ModelAttribute ItemRegisterForm itemRegisterForm) {
        return "itemRegisterForm";
    }

}
