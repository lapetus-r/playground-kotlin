fun main() {
    val matrix = listOf(
        listOf("aA", "aB", "aC", "aD", "aE", "aF"),
        listOf("bA", "bB", "bC", "bD", "bE", "bF"),
        listOf("cA", "cB", "cC", "cD", "cE", "cF"),
        listOf("dA", "dB", "dC", "dD", "dE", "dF"),
        listOf("eA", "eB", "eC", "eD", "eE", "eF"),
        listOf("fA", "fB", "fC", "fD", "fE", "fF")
    )
    solution(matrix)
}

fun solution(matrix: List<List<String>>) {
    var m = matrix
    while (m.isNotEmpty()) {
        m.dropLast(1).map { it.first() }.forEach(::println)
        m.last().dropLast(1).forEach(::println)
        m.reversed().dropLast(1).map { it.last() }.forEach(::println)
        m.first().reversed().dropLast(1).forEach(::println)
        m = m.drop(1).dropLast(1).map { it.drop(1).dropLast(1) }
    }
}