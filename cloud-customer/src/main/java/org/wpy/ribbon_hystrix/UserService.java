package org.wpy.ribbon_hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.wpy.User;

/**
 * Created by Administrator on 2017/3/30.
 */
@Service
@Hystrix
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getUser2")
    public User getUser(){
       return restTemplate.getForObject("http://cloud-service/getUser",User.class);
    }

    public User getUser2(){
        return null;
    }

    public User[] postUser(){
        return restTemplate.postForObject("http://cloud-service/postUser",null,User[].class);
    }

    public String postUserName(){
        return restTemplate.postForObject("http://cloud-service/postUserName",null,String.class);
    }

    public String getUserName(){
        return restTemplate.getForObject("http://cloud-service/getUserName",String.class);
    }


}
