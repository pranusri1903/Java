class Con2 {
    fun solve() {
        val t = readln().toInt()
        val results = mutableListOf<Long>()

        repeat(t) {
            val n = readln().toInt()
            val s = readln()

            val dashCount = s.count { it == '-' }
            val underscoreCount = s.count { it == '_' }

            if (n < 3 || dashCount < 2 || underscoreCount < 1) {
                results.add(0)
            } else {
                val d1 = dashCount / 2
                val d2 = dashCount - d1
                val maxSubsequences = d1.toLong() * underscoreCount * d2.toLong()
                results.add(maxSubsequences)
            }
        }

        // Print all results
        for (res in results) {
            println(res)
        }
    }
}

fun main() {
    val con2 = Con2()
    con2.solve()
}
