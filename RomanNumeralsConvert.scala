object RomanNumeralsConvert extends App {

  def romanToInt(s: String): Int = {
    var romanNumString: String = s
    var romanNumStringClone: String = s
    var romanList: List[Char] = List('I', 'V', 'X', 'L', 'C', 'D', 'M')
    var intengList: List[Int] = List(1, 5, 10, 50, 100, 500, 1000)
    var (resultSumList: List[Int], resultSum: Int, a: Int, i: Int) = (List(), 0, 0, romanNumString.length)
    var resultSumListClone: List[Int] = List()
    while (a < i) {
      romanNumStringClone = romanNumString.tail
      if ((a + 1 < i) && (romanToOneSymbol(romanNumString.head) < romanToOneSymbol(romanNumStringClone.head)))
        resultSum -= romanToOneSymbol(romanNumString.head)
      else resultSum += romanToOneSymbol(romanNumString.head)
      romanNumString = romanNumString.tail
      a += 1
    }

    def romanToOneSymbol(newSymbol: Char): Int = {
      var n: Int = 0
      var resultNumber: Int = 0
      while (n <= 6) {
        if (romanList(n) == newSymbol) resultNumber = intengList(n)
        n += 1
      }
      resultNumber
    }

    resultSum
  }

  println(romanToInt("MCMXCIV"))
}
