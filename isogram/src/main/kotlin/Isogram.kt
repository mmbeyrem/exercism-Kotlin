class Isogram {
    companion object{

        fun isIsogram(input: String):Boolean {
           val chars= input.toCharArray().filter { c -> c.isLetter() }

            val charsCounter :MutableList<Char> = mutableListOf()
            for (c in chars.map { c -> c.toLowerCase() }){
                if(charsCounter.find { y -> y == c } == null)
                charsCounter.add(c)
                else
                    break
            }
            return charsCounter.size == chars.size
        }
    }
}