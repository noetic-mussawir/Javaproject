package com.PostgresCRUD.CRUDABC.controller;

import com.PostgresCRUD.CRUDABC.model.UserEntity;
import com.PostgresCRUD.CRUDABC.service.UserEntityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserEntityController {
@Autowired
    UserEntityServiceImpl uesi;

@GetMapping("/all")
    public UserEntity showalldata(){
    return uesi.fetchAllData(Integer.valueOf(1));
}


}
