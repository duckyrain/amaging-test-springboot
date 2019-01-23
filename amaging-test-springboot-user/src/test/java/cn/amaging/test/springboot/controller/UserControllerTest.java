package cn.amaging.test.springboot.controller;

import cn.amaging.test.springboot.BootStrapApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by DuQiyu on 2019/1/23 15:43.
 */
public class UserControllerTest extends BootStrapApplicationTest {

    @Autowired
    private UserController userController;

    @Test
    public void users() {
        Map<String, String> params = new HashMap<>();
        params.put("userName", "amaging");
        System.out.println(userController.users(params));
    }
}