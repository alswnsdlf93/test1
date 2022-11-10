package com.example.test1.user;

import com.example.test1.user.model.User;
import com.example.test1.user.model.UserFromDatabase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    List<UserFromDatabase> getUsers();

    Boolean deleteUser(String employeesNumber);
    Boolean updateUser(String employeesNumber);


    List<UserFromDatabase> getFindUser(String firstName, String lastName);
    List<UserFromDatabase> insertUser(String firstName, String lastName);
}


//    Boolean insertUser(String employeesNumber);
//    Boolean getUser(String employeesNumber);

