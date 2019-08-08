class Hamming {
    companion object {
        fun compute(l: String, r: String): Int =
            if (l.length == r.length) {
                l.zip(r).count { z -> z.first != z.second }
            } else {
                throw IllegalArgumentException("left and right strands must be of equal length.")
            }
        }
}