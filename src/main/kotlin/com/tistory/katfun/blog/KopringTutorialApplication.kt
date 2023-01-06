package com.tistory.katfun.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class KopringTutorialApplication

fun main(args: Array<String>) {
    runApplication<KopringTutorialApplication>(*args)
}
