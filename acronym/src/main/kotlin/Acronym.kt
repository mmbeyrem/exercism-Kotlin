class Acronym {
    companion object {
        fun generate(phrase: String): String {
            return phrase.split(' ', '-').joinToString ("",transform = {it.take(1).toUpperCase()})
        }
    }
}