package com.zxcc.test;

import com.zxcc.test.model.User;
import com.zxcc.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 共出现三个问题：
 *
 *  1.sql文件的路径和接口的路径不一致
 *  2.编写接口的参数名称是username  sql文件的获取的是#{name} 不一致
 *  3.数据连接时端口不小心写成3306
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class SpringcloudTestApplicationTests {


    @Autowired
    private UserService userService;

    @Test
   public void contextLoads() {

        User user = userService.getInfo("zhangsan", "123456");

        System.out.println(user);

    }

}
