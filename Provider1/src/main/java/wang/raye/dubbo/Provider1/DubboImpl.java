package wang.raye.dubbo.Provider1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import wang.raye.dubbo.interfaces.DubboInterface;

@Service
@Slf4j
public class DubboImpl implements DubboInterface {

    public String hello(String name) {
        log.info("hello  request  " + name);
        String str = "hello " + name + "  this is dubbodemo1";
        log.info("hello  back  " + str);
        return str;
    }

}
