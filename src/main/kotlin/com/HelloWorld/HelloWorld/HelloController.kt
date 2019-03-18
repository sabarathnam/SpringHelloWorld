package com.HelloWorld.HelloWorld

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @RequestMapping("/")
    fun Hello():String{
        return "Hello World 123!!!"
    }
}