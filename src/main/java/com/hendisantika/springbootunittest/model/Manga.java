package com.hendisantika.springbootunittest.model;

import lombok.*;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-unit-test-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-23
 * Time: 19:36
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Manga {
    private String title;
    private String description;
    private Integer volumes;
    private Double score;
}