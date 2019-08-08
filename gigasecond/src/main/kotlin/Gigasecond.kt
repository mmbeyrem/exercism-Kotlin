import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(localDateTime: LocalDateTime) {

    private val _gigasecond = 1_000_000_000L

    val date: LocalDateTime = localDateTime.plusSeconds(_gigasecond)

    constructor(localDate: LocalDate):this(localDate.atStartOfDay())
}