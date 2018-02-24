package org.wpy.feign_hystrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.wpy.Role;

/**
 * Created by wpy on 2017/3/31.
 */


@FeignClient(name = "cloud-boss",fallback = HystrixFallBackHandler.class )
public interface RoleService {

    /**
     *  error：feign的对象参数请求都是post，声明为GET方法时候，还是post发送。
     *        修改服务提供当的方法为post。
     */
    @GetMapping("/getRole")
    Role getRole(@RequestBody Role role);

    @PostMapping("/postRole")
    Role postRole();


    @PostMapping("/postRoleName")
    String postRoleName();

    @GetMapping("/getRoleName")
    String getRoleName();

}
