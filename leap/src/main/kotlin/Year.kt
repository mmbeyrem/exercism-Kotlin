class Year(val year: Int) {

    val isLeap: Boolean = IsLeep()

    private fun IsLeep() : Boolean =
             ! (year % 4 !=0 || ((year %100 == 0)&& (year %400 != 0)))

}