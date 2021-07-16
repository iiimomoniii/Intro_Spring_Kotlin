package com.iiimomoniii.introspringkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntroSpringKotlinApplication

fun main(args: Array<String>) {
	println("hello world")
	runApplication<IntroSpringKotlinApplication>(*args)
}
