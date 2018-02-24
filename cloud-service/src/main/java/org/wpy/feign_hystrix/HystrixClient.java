package org.wpy.feign_hystrix;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wpy on 2017/3/31.
 */
@FeignClient(name = "hello", fallback = HystrixClientFallback.class)
public interface HystrixClient {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String iFailSometimes();
}

@Component
class HystrixClientFallback implements HystrixClient {
    @Override
    public String iFailSometimes() {
        return new String("fallback");
    }
}
