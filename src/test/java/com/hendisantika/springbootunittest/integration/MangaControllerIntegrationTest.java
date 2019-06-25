package com.hendisantika.springbootunittest.integration;

import com.hendisantika.springbootunittest.controller.MangaController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-26
 * Time: 05:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MangaControllerIntegrationTest {
    @Autowired
    protected WebApplicationContext wac;
    // @Autowired
    MockMvc mockMvc;
    @Autowired
    MangaController mangaController;
}
