import java.io.File
import java.math.BigInteger

fun main() {
    val result = File("input-201.txt")
        .readLines()
        .mapNotNull { it.trim().toBigIntegerOrNull() }
        .fold(BigInteger.ZERO, BigInteger::xor)

    println(result)
}