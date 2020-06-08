import java.io.File
import java.util.*

fun main() {
    val pattern = "-?\\d+".toPattern()
    val scanner = Scanner(File("input1.txt"))
    val target = scanner.next(pattern).toInt()
    val numbersSet = hashSetOf<Int>()
    var result = 0

    while (scanner.hasNext(pattern)) {
        val number = scanner.next(pattern).toInt()
        if (numbersSet.contains(target - number)) {
            result = 1
            break
        }
        numbersSet.add(number)
    }

    File("output.txt")
        .writeText("$result")
}
