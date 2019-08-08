class Squares(private val number: Int) {

    fun squareOfSum(): Int = generateSequence(1 , { it + 1 }).take(number).sum().double()

    fun sumOfSquares(): Int =
            generateSequence(1 , { it + 1 }).take(number).map { it.double() }.sum()

    fun difference(): Int = squareOfSum() - sumOfSquares()

    private fun Int.double() :Int = this * this
}

