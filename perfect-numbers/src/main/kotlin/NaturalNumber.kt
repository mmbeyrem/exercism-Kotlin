import org.w3c.dom.ranges.RangeException
import java.lang.RuntimeException

enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if(naturalNumber <=0) throw RuntimeException()
    var sum = 0
    for(i in 1..(naturalNumber/2)){
            sum += if(naturalNumber % i==0)i else 0
    }
    return if(sum == naturalNumber)Classification.PERFECT else if (sum> naturalNumber) Classification.ABUNDANT else Classification.DEFICIENT
}
