
fun prosesDenganList(data: List<Int>): List<Int> {
    return data
        .filter { it % 2 == 0 }
        .map { it * it }
        .take(5)
}

fun prosesDenganSequence(data: List<Int>): List<Int> {
    return data
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it * it }
        .take(5)
        .toList()
}

fun main() {
    val data = (1..1_000_000).toList()
"Sequence: $hasilSequence (${waktuSequence}ms)")
}