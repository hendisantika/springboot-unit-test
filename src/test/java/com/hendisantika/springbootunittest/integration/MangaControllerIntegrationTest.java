package com.hendisantika.springbootunittest.integration;

import com.hendisantika.springbootunittest.controller.MangaController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

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

    @Before
    public void setup() throws Exception {
        this.mockMvc = standaloneSetup(this.mangaController).build();// Standalone context
        // mockMvc = MockMvcBuilders.webAppContextSetup(wac)
        // .build();
    }

    @Test
    public void testSearchSync() throws Exception {
        mockMvc.perform(get("/manga/sync/ken").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*.title", hasItem(is("Hokuto no Ken"))));
    }
}
