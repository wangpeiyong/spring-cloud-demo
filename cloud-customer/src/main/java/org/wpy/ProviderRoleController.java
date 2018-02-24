package org.wpy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
public class ProviderRoleController {

    @PostMapping("/getRole")
    public Role getRole(@RequestBody Role role){
        return role;
    }

    @PostMapping("/postRole")
    public Role postRole(){
        return new Role("管理员",12);
    }


    @PostMapping("/postRoleName")
    public String postRoleName(){
        return "管理员";
    }

    @GetMapping("/getRoleName")
    public String getRoleName(){
        return "zhangsan";
    }
}
