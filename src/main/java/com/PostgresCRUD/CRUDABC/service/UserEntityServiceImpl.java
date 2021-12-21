package com.PostgresCRUD.CRUDABC.service;

import com.PostgresCRUD.CRUDABC.model.UserEntity;
import com.PostgresCRUD.CRUDABC.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserEntityServiceImpl   {
    @Autowired
    UserEntityRepository userEntityRepository;

    public UserEntity fetchAllData(int id) {
        return userEntityRepository.getId(id);
    }
}
