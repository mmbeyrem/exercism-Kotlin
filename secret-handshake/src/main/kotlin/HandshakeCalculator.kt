import java.lang.Error
import java.util.*

class HandshakeCalculator {
    companion object {
        private val code = mapOf(1 to Signal.WINK , 2 to Signal.DOUBLE_BLINK , 4 to Signal.CLOSE_YOUR_EYES , 8 to Signal.JUMP)
        fun calculateHandshake(input: Int): List<Signal> {
            var tmp = input % 16

            var r = Stack<Signal>()
            code.toSortedMap(reverseOrder()).forEach {
                if (tmp - it.key >= 0) {
                    r.push(it.value)
                    tmp -= it.key
                }
            }
            return if (input > 16) r else r.reversed()
        }
    }
}