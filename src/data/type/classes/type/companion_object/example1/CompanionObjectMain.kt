package data.type.classes.type.companion_object.example1

fun main(args: Array<String>) {
    println("Heyyy!!! "+ A.show())
}

class A {
    companion object {
        fun show(): String {
            return("You are learning Kotlin from TutorialsPoint.com")
        }
    }
}