package cn.ali.dubo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.apache.zookeeper.Op;

/**
 *  <dubbo:service   interface="cn.ali.dubo.service.HelloService"  ref="helloService"/>
 *     <bean id="helloService" class="cn.ali.dubo.service.HelloServcieImpl"></bean>
 *   时候,@Service 注释掉
 */
//@Service
public class HelloServcieImpl implements HelloService {

    public String sayHello(String s) {
        System.out.println("=======我被调用了====== name:" + s);

        return "hello " + s;
    }
}
