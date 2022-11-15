package com.example.test1.user;

import com.example.test1.user.model.User;
import com.example.test1.user.model.UserFromDatabase;
import com.example.test1.user.model.UserFromDatabase;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

//    private Object employeeNumber;

    public UserController(UserService userService) {

        this.userService = userService;
    }

    @GetMapping("/user")
    public List<UserFromDatabase> getUser(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName
    ) {
       return userService.searchUserFromDatabase(firstName, lastName);
    }

    @PostMapping("/user")
    public Integer insertUser (
            @RequestBody UserFromDatabase userFromDatabase){
        return userService.insertUser(userFromDatabase);
    }
}

//    @GetMapping("/user")
//    public Boolean user() {
//
//        return true;
//    }
//
////    @GetMapping("/user")
////    public int user() {
////
////        return this.employeeNumber = employeeNumber;
////    }
//
//    @DeleteMapping("/user/{employeesNumber}")
//    public Boolean deleteUser(
//            @PathVariable String employeesNumber
//    ) {
//        return userService.deleteUser(employeesNumber);
//    }
//    @PutMapping
//    public Boolean insertUser(
//            @PathVariable String employeeNumber
//    ) {
//        return userService.insertUser(employeeNumber);
//    }
//    @GetMapping
//    public Boolean getUser(
//            @PathVariable String employeeNumber
//    ) {
//        return userService.getUser(employeeNumber);
//    } // 왜 에러 메시지에 중국어가 계속 나오는걸까요ㅠ
//    @PostMapping
//    public Boolean updateUser(
//            @PathVariable String employeeNumber
//    ) {
//        return userService.updateUser(employeeNumber);
//    }
//
//    @GetMapping("/users")
//    public List<User> users() {
//        return userService.findAll();
//
//    }
//
//    @GetMapping("/userFromDatabase")
//    public List<UserFromDatabase> userFromDatabase() {
//        return userService.findAllFromDatabase();
//    }
//}
