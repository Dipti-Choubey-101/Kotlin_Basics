fun main(args: Array<String>) {

    // getMax with Double
    val max = getMax(a = 6.7, b = 9.7)
    println(max)

    // sendMessage
    sendMessage(name = "Dipti")

    // sum with fixed parameters
    println(sum(a = 6, b = 2, c = 4, d = 7))

    // sum with vararg
    println(sum(5,6,7,8,9,2,1,3,4,5,6,7,8))

    // print each number
    printNumbers(1,2,3,4,5,6,7,8,9)
}

/* ---------- FUNCTIONS ---------- */

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun sendMessage(name: String, message: String = "") {
    println("Name = $name and message = $message")
}

fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}

fun printNumbers(vararg numbers: Int) {
    numbers.forEach { println(it) }
}
