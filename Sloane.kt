fun main() {
   val num = readln()

   println(sloaneFormula(num.toInt()))
}

fun sloaneFormula(input: Int): String {
   var string = ""

   for (i in 0 until input) {
      val num = (i*(i + 1) / 2) + 1
      string += "-$num"
   }

   return string.removePrefix("-")
}