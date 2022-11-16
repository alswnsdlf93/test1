package com.example.test1.user;

import com.example.test1.user.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.test1.user.model.UserFromDatabase;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private static int usersCount = 3;

    static {
        users.add(new User(1, "JunIl", new Date()));
        users.add(new User(2, "Min", new Date()));
        users.add(new User(3, "Sam", new Date()));
    }

    public static void update(UserFromDatabase userFromDatabase) {
        return;
    } // 추가


    public List<User> findAll(){
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public List<UserFromDatabase> findAllFromDatabase() {
        return userRepository.getUsers();
    }

    public List<UserFromDatabase> searchUserFromDatabase(String firstName, String lastName) {
        return userRepository.getFindUser(firstName, lastName);
    }
    public Integer insertUser(UserFromDatabase userFromDatabase) {
        return userRepository.insertUser(userFromDatabase);
    }
    public Integer deleteUser(Integer employeeNumber) {
        return userRepository.deleteUser(employeeNumber);
    }
    public Integer updateUser(Integer employeeNumber) {
        return userRepository.updateUser(employeeNumber);
    }
}







//
//    public Boolean deleteUser(String employeesNumber) {
//        return userRepository.deleteUser(employeesNumber);
//    }
//
//    public Boolean insertUser(String employeeNumber) {
//        return userRepository.insertUser(employeeNumber);
//    }
//
//    public Boolean getUser(String employeeNumber) {
//        return userRepository.getUser(employeeNumber);
//    }
//
//    public Boolean updateUser(String employeeNumber) {
//        return userRepository.updateUser(employeeNumber);
//    }

