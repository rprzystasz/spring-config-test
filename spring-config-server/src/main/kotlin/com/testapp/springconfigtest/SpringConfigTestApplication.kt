package com.testapp.springconfigtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringConfigTestApplication

fun main(args: Array<String>) {
    runApplication<SpringConfigTestApplication>(*args)
}
