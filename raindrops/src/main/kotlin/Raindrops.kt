class Raindrops{
    companion object{
        fun convert(number :Int):String{
            var r = ""
            if (number%3 ==0) r+= "Pling"
            if (number%5 ==0) r+= "Plang"
            if (number%7 ==0) r+= "Plong"

            if (r == "") {
                return "$number"
            } else return r
        }
    }
}