package com.practice.demo.service;

import com.practice.demo.entity.User;
import com.practice.demo.entity.UserRepository;
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
     * @param user 登録対象のユーザー
     */
    @Transactional
    public void register(User user) {
        userRepository.save(user);
    }

}
