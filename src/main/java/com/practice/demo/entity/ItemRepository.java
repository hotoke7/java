package com.practice.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 商品リポジトリ。
 */
public interface ItemRepository extends JpaRepository<Item, Integer>, JpaSpecificationExecutor<User> {
}