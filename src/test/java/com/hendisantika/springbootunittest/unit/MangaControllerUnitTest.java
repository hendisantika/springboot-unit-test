package com.hendisantika.springbootunittest.unit;

import com.hendisantika.springbootunittest.controller.MangaController;
import com.hendisantika.springbootunittest.model.Manga;
import com.hendisantika.springbootunittest.service.MangaService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-26
 * Time: 05:46
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MangaControllerUnitTest {
    @Autowired
    protected WebApplicationContext wac;
    MockMvc mockMvc;
    @Autowired
    MangaController mangaController;

    @MockBean
    MangaService mangaService;

    /**
     * List of samples mangas
     */
    private List<Manga> mangas;
}
