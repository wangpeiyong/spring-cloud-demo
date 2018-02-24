package org.wpy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpy.ribbon_hystrix.UserService;

import java.util.Properties;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser() {
        return userService.getUser();
    }

    @PostMapping("/postUser")
    public User[] postUser() {
        return userService.postUser();
    }


    @PostMapping("/postUserName")
    public String postUserName() {
        return userService.postUserName();
    }

    @GetMapping("/getUserName")
    public String getUserName() {
        return userService.getUserName();
    }


    @GetMapping("/getPropeties")
    public Properties getPropeties() {
        return System.getProperties();
    }
}
