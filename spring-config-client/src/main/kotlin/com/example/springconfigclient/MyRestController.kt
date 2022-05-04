package com.example.springconfigclient

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MyRestController(val appConfiguration: AppConfiguration) {

    @GetMapping("/config")
    fun config() =
            appConfiguration

}

@ConfigurationProperties("configuration")
data class AppConfiguration(
        var configuration: Map<String, Any>,
        var key1: String?,
        var key2: String?,
        var key3: String?,
        var key4: String?,
        var key5: String?,
        var key6: String?
)