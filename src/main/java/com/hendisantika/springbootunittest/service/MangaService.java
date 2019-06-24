package com.hendisantika.springbootunittest.service;

import com.hendisantika.springbootunittest.model.Manga;
import com.hendisantika.springbootunittest.model.MangaResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-24
 * Time: 08:33
 */
@Service
public class MangaService {

    private static final String MANGA_SEARCH_URL = "http://api.jikan.moe/search/manga/";
    Logger logger = LoggerFactory.getLogger(MangaService.class);
    @Autowired
    RestTemplate restTemplate;


    public List<Manga> getMangasByTitle(String title) {
        return restTemplate.getForEntity(MANGA_SEARCH_URL + title, MangaResult.class).getBody().getResult();
    }

}