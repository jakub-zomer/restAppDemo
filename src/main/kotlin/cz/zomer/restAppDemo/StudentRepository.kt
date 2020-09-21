package cz.zomer.restAppDemo


class StudentRepository() {

    var storage = HashSet<Student>()

    fun get(id: Long): Student {
        return storage.filter { student -> student.id.equals(id) }.first()
    }
    fun getAll(id: Long): List<Student> {
        return storage.toList()
    }

    fun create(student: Student): Student {
        student.id = (storage.size) + 1.toLong()
        storage.add(student)
        return student
    }

    fun update(firstName: String, lastName: String, personalNumber: String, id: Long) : Student {
        val student = Student(
                id = id,
                firstName = firstName,
                lastName = lastName,
                personalNumber = personalNumber
        )
        delete(id)
        storage.add(student)
        return student
    }

    fun delete(id: Long) {
        val student = get(id)
        storage.remove(storage)
    }
}