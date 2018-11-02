package com.practice.demo.service;

import com.practice.demo.entity.User;
import com.practice.demo.entity.UserRepository;
import com.practice.demo.form.UserRegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ユーザー登録サービス。
 */
@Service
public class UserRegisterService {

    /** ユーザーリポジトリ */
    private final UserRepository userRepository;

    @Autowired
    public UserRegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 登録処理。
     *
     * @param form フォーム
     */
    @Transactional
    public void register(UserRegisterForm form) {
        User user = new User();
        user.setName(form.getFmailyName() + " "+ form.getGivenName());
        userRepository.save(user);
    }

}
