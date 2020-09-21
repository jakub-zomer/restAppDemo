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
    @RequestMapping("/students/{studentID}")
    fun delete(@PathVariable studentId: Long) {
        return studentRepository.delete(studentId)
    }

    @GetMapping("/students/{studentId}")
    fun update(@RequestBody firstName: String, lastName: String, personalNumber: String, id: Long): Student{
        return studentRepository.update(id = id,
                firstName = firstName,
                lastName = lastName,
                personalNumber = personalNumber)
    }


}
