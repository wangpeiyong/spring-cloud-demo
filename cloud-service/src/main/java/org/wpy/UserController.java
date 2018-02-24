package org.wpy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
public class UserController {

    @GetMapping("/getUser")
    public User getUser(){
        return new User("zhangsan",12);
    }

    @PostMapping("/postUser")
    public User postUser(){
        return new User("zhangsan",12);
    }


    @PostMapping("/postUserName")
    public String postUserName(){
        return "zhangsan";
    }

    @GetMapping("/getUserName")
    public String getUserName(){
        return "zhangsan";
    }
}
