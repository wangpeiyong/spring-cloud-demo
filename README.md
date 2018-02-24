# spring-cloud-demo

zipkin：http://localhost:9411/

spring boot admin :http://localhost:8081/
 
eureka：http://localhost:9000/

cloud-service调用：http://localhost:8080/api-service/getUserName?accessToken=111   通过api
        
                  http://localhost:9002/getUser?name=admin&id=1


cloud-customer调用： http://localhost:8080/api-boss/hello?accessToken=23432   通过api

                    http://localhost:9001/getUser
                    
                    
测试ribbon+hystrix断路器： http://localhost:8080/api-boss/getUser?accessToken=23432
    
                        http://localhost:8081/#/applications/69f22428/hystrix
 
 
