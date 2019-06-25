package com.hendisantika.springbootunittest.unit;

import com.hendisantika.springbootunittest.controller.MangaController;
import com.hendisantika.springbootunittest.model.Manga;
import com.hendisantika.springbootunittest.service.MangaService;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

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

    @Before
    public void setup() throws Exception {
        this.mockMvc = standaloneSetup(this.mangaController).build();// Standalone context
        // mockMvc = MockMvcBuilders.webAppContextSetup(wac)
        // .build();
        Manga manga1 = Manga.builder()
                .title("Hokuto no ken")
                .description("The year is 199X. The Earth has been devastated by nuclear war...")
                .build();
        Manga manga2 = Manga.builder()
                .title("Yumekui Kenbun")
                .description("For those who suffer nightmares, help awaits at the Ginseikan Tea House, where patrons can order much more than just Darjeeling. Hiruko is a special kind of a private investigator. He's a dream eater....")
                .build();

        mangas = new ArrayList<>();
        mangas.add(manga1);
        mangas.add(manga2);
    }

}
