package com.HelloWorld.HelloWorld

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @RequestMapping("/")
    public fun Hello():String{
        return "Hello World!!!"
    }
}