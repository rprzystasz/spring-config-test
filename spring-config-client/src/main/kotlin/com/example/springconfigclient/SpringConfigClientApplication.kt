package com.example.springconfigclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(AppConfiguration::class)
class SpringConfigClientApplication

fun main(args: Array<String>) {
    runApplication<SpringConfigClientApplication>(*args)
}
