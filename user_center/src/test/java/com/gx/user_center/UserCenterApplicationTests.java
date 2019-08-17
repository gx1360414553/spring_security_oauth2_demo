package com.gx.user_center;

import com.gx.entity.XcUser;
import com.gx.user_center.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserCenterApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        XcUser itcast = userService.findXcUserByUsername("itcast");
        System.out.println(itcast);
    }

}
