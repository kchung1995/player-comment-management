package com.tistory.katfun.playercommentmanagement.healthcheck

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheck {

    @RequestMapping("ping")
    fun pingPong(): String = "pong"
}