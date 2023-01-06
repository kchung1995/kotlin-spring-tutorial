package com.tistory.katfun.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) =
        ApplicationRunner {
            val smaldini = userRepository.save(User("smaldini", "stéphane", "Maldini"))
            articleRepository.save(
                Article(
                    title = "Reactor Bismuth is out",
                    headline = "Lorem Ipsum",
                    content = "dololr sit amet",
                    author = smaldini

                )
            )
            articleRepository.save(
                Article(
                    title = "Reactor Aluminium has landed",
                    headline = "Lorem Ipsum",
                    content = "dolor sit amet",
                    author = smaldini
                )
            )
        }
}