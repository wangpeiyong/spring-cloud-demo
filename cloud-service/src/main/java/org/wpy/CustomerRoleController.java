package org.wpy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wpy.feign_hystrix.HystrixClient;
import org.wpy.feign_hystrix.RoleService;

/**
 * Created by Administrator on 2017/3/30.
 */
@RestController
public class CustomerRoleController {

    @Autowired
    HystrixClient hystrixClient;
    @Autowired
    private RoleService roleService;

    @GetMapping("/getRole")
    public Role getRole(@ModelAttribute Role role) {
        return roleService.getRole(role);
    }

    @PostMapping("/postRole")
    public Role postRole() {
        return roleService.postRole();
    }

    @PostMapping("/postRoleName")
    public String postRoleName() {
        return roleService.postRoleName();
    }

    @GetMapping("/getRoleName")
    public String getRoleName() {
        return roleService.getRoleName();
    }

    @GetMapping("/test")
    public String test() {
        return hystrixClient.iFailSometimes();
    }


}
