package com.hendisantika.springbootunittest.controller;

import com.hendisantika.springbootunittest.model.Manga;
import com.hendisantika.springbootunittest.service.MangaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-25
 * Time: 05:33
 */
@RestController
@RequestMapping(value = "/manga")
public class MangaController {

    Logger logger = LoggerFactory.getLogger(MangaController.class);

    @Autowired
    private MangaService mangaService;

    @RequestMapping(value = "/async/{title}", method = RequestMethod.GET)
    @Async
    public CompletableFuture<List<Manga>> searchASync(@PathVariable(name = "title") String title) {
        return CompletableFuture.completedFuture(mangaService.getMangasByTitle(title));
    }

    @RequestMapping(value = "/sync/{title}", method = RequestMethod.GET)
    public @ResponseBody
    List<Manga> searchSync(@PathVariable(name = "title") String title) {
        return mangaService.getMangasByTitle(title);
    }

}