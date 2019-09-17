package cn.amaging.test.springboot.service;

import cn.amaging.test.springboot.api.UserService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by DuQiyu on 2019/1/23 11:50.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String users(Map<String, String> params) {
        String userName = params.get("userName");
        return "hello, " + userName;
    }
}
