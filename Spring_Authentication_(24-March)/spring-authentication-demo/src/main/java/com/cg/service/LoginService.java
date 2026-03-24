package com.cg.service;

import com.cg.dao.ILoginRepository;
import com.cg.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private ILoginRepository repo;

    public Login validateUser(Login login){
        Optional<Login> op = repo.findById(login.getId());
        if (op.isPresent()){
            if (op.get().getPassword().equals(login.getPassword())){
                return op.get();
            }
        }
        return null;
    }
}
