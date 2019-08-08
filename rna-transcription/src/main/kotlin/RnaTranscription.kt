import java.rmi.UnexpectedException

fun transcribeToRna(dna: String): String {
   return dna.map { d ->
       when (d) {
           'G' -> 'C'
           'C' -> 'G'
           'T' -> 'A'
           'A' -> 'U'
           else -> throw UnexpectedException("$d is not supported")
       }
   }.joinToString("")
}
