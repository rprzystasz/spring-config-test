package com.example.springconfigclient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MyRestController {

    @GetMapping("/config")
    fun config() = "value"

}

data class Greeting(
    val response: String
)