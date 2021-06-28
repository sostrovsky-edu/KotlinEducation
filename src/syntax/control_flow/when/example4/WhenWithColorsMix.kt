import data.type.classes.type.enum_class.example4.Colors
import data.type.classes.type.enum_class.example4.Colors.*

fun main() {
    println("1. ${getMixOf(RED, YELLOW)}")
    println("2. ${getMixOf(YELLOW, BLUE)}")
    println("3. ${getMixOf(BLUE, VIOLET)}")
    println("4. ${getMixOf(RED, BLUE)}")

    println("5. ${getMixNoArgs(RED, YELLOW)}")
    println("6. ${getMixNoArgs(YELLOW, BLUE)}")
    println("7. ${getMixNoArgs(BLUE, VIOLET)}")
    println("8. ${getMixNoArgs(RED, BLUE)}")
}

fun getMixOf(color1: Colors, color2: Colors) =
        when (setOf(color1, color2)) {
            setOf(RED, YELLOW) -> ORANGE.name
            setOf(YELLOW, BLUE) -> GREEN.name
            setOf(BLUE, VIOLET) -> INDIGO.name
            else -> "Грязный цвет"
        }

// Выражение when без аргументов (optimized: не используем set)
fun getMixNoArgs(color1: Colors, color2: Colors) =
        when {
            (color1 == RED && color2 == YELLOW) || (color1 == YELLOW && color2 == RED) -> ORANGE
            (color1 == YELLOW && color2 == BLUE) || (color1 == BLUE && color2 == YELLOW) -> GREEN
            (color1 == BLUE && color2 == VIOLET) || (color1 == VIOLET && color2 == BLUE) -> INDIGO
            else -> throw Exception("Грязный цвет")
        }