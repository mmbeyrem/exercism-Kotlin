import kotlin.math.roundToInt
import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        if(plaintext.isNullOrBlank()) return plaintext
        val normalized = plaintext
                .toLowerCase()
                .filter { it.isLetter() || it.isDigit() }
        val length = normalized.length
        var tmp = sqrt(length.toDouble())
        if (tmp.roundToInt()== tmp.toInt()){
            println(normalized.chunked(tmp.toInt()).toString())
            val words = normalized.chunked(tmp.toInt())
            var newWords = List(words.size) { sequenceOf("", tmp.toInt()) }
            return newWords.mapIndexed{ it, _ ->  words.map { i -> i[it] }
                                            .joinToString("")}
                    .       joinToString(" ")

        }
        return normalized
    }

}
