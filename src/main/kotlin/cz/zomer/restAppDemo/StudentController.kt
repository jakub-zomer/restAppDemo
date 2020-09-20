package cz.zomer.restAppDemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@RestController
class StudentController {

    val studentRepository = StudentRepository()

    @GetMapping("/students/{studentId}")
    fun get(@PathVariable studentId: Long): Student {
        return studentRepository.get(studentId)
    }

    @PostMapping("/students")
    fun create(@RequestBody student: Student): Student {
        return studentRepository.create(student)
    }
}
