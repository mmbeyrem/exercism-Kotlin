object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        return when(category){
            YachtCategory.YACHT -> yachSocre(dices)
            YachtCategory.ONES -> ScoreIf(1,dices)
            YachtCategory.TWOS -> ScoreIf(2,dices)
            YachtCategory.THREES -> ScoreIf(3,dices)
            YachtCategory.FOURS -> ScoreIf(4,dices)
            YachtCategory.FIVES -> ScoreIf(5,dices)
            YachtCategory.SIXES -> ScoreIf(6,dices)
            YachtCategory.FULL_HOUSE -> fullHouseScore(dices)
            YachtCategory.FOUR_OF_A_KIND -> fourForAkindScore(dices)
            YachtCategory.LITTLE_STRAIGHT -> allNumberExcept(dices,6)
            YachtCategory.BIG_STRAIGHT -> allNumberExcept(dices,1)
            YachtCategory.CHOICE -> dices.sum()
            else -> 0
        }
    }

    private fun allNumberExcept(dices: IntArray, skip :Int): Int {
        return if(dices.groupBy { it }
                .keys.filter { it != skip }
                     .count()>=5)
        {
            30
        }
        else{
            0
        }
    }

    private fun fourForAkindScore(dices: IntArray): Int {
        val fourScore = (dices.groupBy { it }
                .filter {  it.value.count() >= 4 }
                .map { it.key}
                .firstOrNull())
        return if(fourScore==null){
            0
        }
        else
        {
            fourScore *4
        }

    }

    private fun fullHouseScore(dices: IntArray): Int {
        val threes = dices.groupBy { it }
                .filter {  it.value.count() == 3 }
                .map { it.value}
                .flatten()
                .sumBy { it }
        if(threes == 0)
            return  0

        val seconds = dices.groupBy { it }
                .filter {  it.value.count() == 2 }
                .map { it.value}
                .flatten()
                .sumBy { it }

        return  threes + seconds

    }

    private fun ScoreIf(filterBy: Int , dices: IntArray): Int = dices.filter { it == filterBy }.count()*filterBy

    private fun yachSocre(dices: IntArray): Int =
            if(dices.any{ it != dices[0] }) 0
            else 50
}
