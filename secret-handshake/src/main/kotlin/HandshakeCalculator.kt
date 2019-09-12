    class HandshakeCalculator {
        companion object {

            fun calculateHandshake(input: Int): List<Signal> = Signal.values()
                    .reversed()
                    .filter { input and it.code == it.code }
                    .let{ if  (it.firstOrNull() == Signal.REVERSE) it.minus(Signal.REVERSE) else it.reversed() }
        }
    }