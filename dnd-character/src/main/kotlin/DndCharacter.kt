import kotlin.math.ceil
import kotlin.math.floor
import kotlin.random.Random

class DndCharacter {

    val strength: Int =  ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {

        fun ability(): Int {
           return IntRange(0,3)
                   .map { Random.nextInt(0,6) }
                   .sortedByDescending { i -> i }
                   .take(3)
                   .sum()

        }

        fun modifier(score: Int): Int {
            return floor((score - 10.0)/2).toInt()
        }
    }

}
