package cn.amaging.test.springboot;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by DuQiyu on 2018/12/27 14:01.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BootStrapApplicationTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("========================================Test Begin========================================");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("========================================Test End========================================");
    }
}