package cz.zomer.restAppDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView


@SpringBootApplication
class RestAppDemoApplication

fun main(args: Array<String>) {
	runApplication<RestAppDemoApplication>(*args)
}

