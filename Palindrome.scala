object SolutionsPalindrome extends App {
  def isPalindrome(x: Int): Boolean = {
    if (x >= 0) {
      var xNumberChar: List[Char] = List(x).flatMap(_.toString.toList)
      var xNumberCharSize: Int = xNumberChar.size
      var xReversNumber: Int = 0
      var decMultiply: Int = 1
      while (xNumberChar.nonEmpty) {
        xReversNumber += xNumberChar.head.asDigit * decMultiply
        decMultiply *= 10
        xNumberChar = xNumberChar.tail
      }
      if (x == xReversNumber) true
      else false
    }
    else false
  }

  println(isPalindrome(1334331), "=1334331\n", isPalindrome(100031), "=100031\n", 
  isPalindrome(-131), "=-1331\n", isPalindrome(133331), "=133331")
}
