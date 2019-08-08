    class Pangram
    {
        companion object {
            private const val alphabetsCount = 26
            fun isPangram(word: String): Boolean =
                    word.toLowerCase()
                            .toCharArray()
                            .filter { c: Char -> c.isLetter() }
                            .distinct().size  == alphabetsCount
        }
    }