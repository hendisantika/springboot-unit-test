package com.hendisantika.springbootunittest.integration;

import com.hendisantika.springbootunittest.model.Manga;
import com.hendisantika.springbootunittest.service.MangaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-26
 * Time: 05:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MangaServiceIntegrationTest {

    @Autowired
    private MangaService mangaService;

    @Test
    public void testGetMangasByTitle() {
        List<Manga> mangasByTitle = mangaService.getMangasByTitle("ken");
        assertThat(mangasByTitle).isNotNull().isNotEmpty();
    }

}
