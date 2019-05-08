package com.clouddash

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Hello

fun main(args: Array<String>) {
    SpringApplication.run(Hello::class.java, *args)
}
