package data.type.classes.type.object_class.companion_object.example2

fun main() {
    val student = Student.create("Chack Norris")
    println("\nThe name of the student is: ${student.name}")

    // will not compile
    // val student1 = Student.Companion()
}

interface StudentFactory {
    fun create(name: String): Student
}

class Student private constructor(val name: String) {
    companion object: StudentFactory {
        override fun create(name: String): Student {
            return Student(name)
        }
    }
}