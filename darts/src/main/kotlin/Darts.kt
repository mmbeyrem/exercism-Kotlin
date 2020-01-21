import kotlin.math.ceil
import kotlin.math.pow
import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number ): Int {
        return when(ceil(sqrt(x.toDouble().pow(2) + y.toDouble().pow(2)))){
            in 0.0..1.0 -> 10
            in 1.1..5.0 -> 5
            in 5.1..10.0 -> 1
            else -> 0
        }
    }
}
