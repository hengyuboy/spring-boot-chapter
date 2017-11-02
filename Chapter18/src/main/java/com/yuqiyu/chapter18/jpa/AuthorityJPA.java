package com.yuqiyu.chapter18.jpa;


import com.yuqiyu.chapter18.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityJPA extends JpaRepository<Authority, String> {
}
