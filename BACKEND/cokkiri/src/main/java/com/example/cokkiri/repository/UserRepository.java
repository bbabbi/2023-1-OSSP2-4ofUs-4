package com.example.cokkiri.repository;

import com.example.cokkiri.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    public List<User> findByName(String name);
    public boolean existsByEmailAndAuthKey(String email,String authKey);
    public boolean existsByEmailAndPasswordAndAuthTrue(String email,String password);
    //관리자 로그인
    public boolean existsByEmailAndPasswordAndAuthTrueAndAdminTrue(String email,String password);

}
