package org.wpy.feign_hystrix;

import org.springframework.stereotype.Component;
import org.wpy.Role;

/**
 * Created by wpy on 2017/3/31.
 */
@Component
public class HystrixFallBackHandler implements RoleService {
    @Override
    public Role getRole(Role role) {
        return null;
    }

    @Override
    public Role postRole() {
        return null;
    }

    @Override
    public String postRoleName() {
        return null;
    }

    @Override
    public String getRoleName() {
        return null;
    }
}
