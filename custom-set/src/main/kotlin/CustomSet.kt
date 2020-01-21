    class CustomSet(private vararg var  items:Int) {
    fun isEmpty(): Boolean = items.isEmpty()

    fun isSubset(other: CustomSet): Boolean = if(isEmpty())
         true
     else items.all { other.items.contains(it) }

    fun isDisjoint(other: CustomSet): Boolean = if(isEmpty() || other.isEmpty())
        true
     else
        ! items.any{ other.items.contains(it) }

    fun contains(other: Int): Boolean = items.contains(other)

    fun intersection(other: CustomSet): CustomSet {
        return CustomSet(* items.filter { other.items.contains(it) }.map { it  }.toIntArray())
    }

        fun add(other: Int) {
        items  = items.plus(other)
    }

    override fun equals(other: Any?): Boolean {
        var otherSet = other as CustomSet
        return isSubset(otherSet) && otherSet.isSubset(this)
    }

    operator fun plus(other: CustomSet): CustomSet {
        return CustomSet(* other.items.filter { !contains(it) }.toIntArray().plus(items))
    }

    operator fun minus(other: CustomSet): CustomSet {
        return if(other.isEmpty())
             this
        else CustomSet(* items.filter { !other.contains(it) }.toIntArray())
    }

        override fun toString(): String {
            return items.contentToString()
        }
}
