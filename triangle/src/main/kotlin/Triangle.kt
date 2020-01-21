class Triangle<T>(private val a : T , val b: T , val c: T){
    init{
        if( (a as Number).toDouble() +  (b as Number).toDouble() < (c as Number).toDouble() ||
            (b as Number).toDouble() +  (c as Number).toDouble() < (a as Number).toDouble() ||
            (a as Number).toDouble() +  (c as Number).toDouble() < (b as Number).toDouble())
            throw IllegalArgumentException()
    }
    private val _isEquilateral: Boolean = a == b && a == b && b == c
    val isEquilateral: Boolean
        get() {
            if(_isEquilateral) {
                if (a == 0)
                    throw IllegalArgumentException()
                return true
            }
            return false
        }
    val isIsosceles: Boolean = a == b  || a == c || b == c
    val isScalene: Boolean = !isIsosceles
}