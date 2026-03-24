package com.cg.dao;

import com.cg.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoginRepository extends JpaRepository <Login, Integer> {
}
