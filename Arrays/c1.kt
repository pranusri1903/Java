class Contest {
    fun solve() {
        val t = readln().toInt() // Number of test cases
        val results = mutableListOf<Int>()

        repeat(t) {
            val n = readln().toInt()
            results.add(n - 1)
        }

        // Print all results after processing
        for (res in results) {
            println(res)
        }
    }
}

fun main() {
    val contest = Contest()
    contest.solve()
}
