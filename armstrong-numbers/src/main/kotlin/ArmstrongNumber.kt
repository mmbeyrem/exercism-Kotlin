import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val inputString = input.toString()
        return  input< 10||
                (input >= 100 &&
                input == inputString.map { it.toString().toInt().toDouble().pow(inputString.length) }.sum().toInt())
    }
}