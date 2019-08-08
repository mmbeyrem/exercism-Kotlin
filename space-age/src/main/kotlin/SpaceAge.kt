import java.math.BigDecimal
import java.math.RoundingMode

class SpaceAge(age: Long) {
    private val _age: Double = age.toDouble()
    private val  onEarth:Double = BigDecimal(_age / 31557600).convert()

    fun onEarth(): Double = onEarth

    fun onMercury(): Double = BigDecimal (onEarth / 0.2408467).convert()

    fun onVenus(): Double  = BigDecimal (onEarth / 0.61519726).setScale(2,RoundingMode.DOWN).toDouble()

    fun onMars(): Double  = BigDecimal (onEarth / 1.8808158).convert()

    fun onJupiter(): Double  = BigDecimal (onEarth / 11.862615).convert()

    fun onSaturn(): Double  = BigDecimal (onEarth / 29.447498).convert()

    fun onUranus(): Double  = BigDecimal (onEarth / 84.016846).convert()

    fun onNeptune(): Double  = BigDecimal (onEarth / 164.79132).convert()

    private fun BigDecimal.convert():Double = this.setScale(2,RoundingMode.HALF_UP).toDouble()


}