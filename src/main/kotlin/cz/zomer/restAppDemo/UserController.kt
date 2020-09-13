package cz.zomer.restAppDemo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class RestController {
    @GetMapping("/student/{studentId}")
    public @ResponseBody
        fun getTestData(@PathVariable studentId: Int?): String {
        val student = Student()
        student.setName("Peter")
        student.setId(studentId)
        return "ahoj"
    }
}
