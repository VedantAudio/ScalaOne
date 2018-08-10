object Parents extends App {

  def balance(chars: List[Char]): Boolean = {
    var myBalance: Int = 0

    
    def myBalanceInto(chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        if (myBalance != 0) false
        else true
      }
      else if (chars.head == ')' && (myBalance == 0)) false
      else {
        if (chars.head == '(') myBalance += 1
        if (chars.head == ')') myBalance -= 1
        myBalanceInto(chars.tail)
      }
    }
    myBalanceInto(chars)
  }
  println(balance("(gjfgjgfjgfj)".toList), balance("())(".toList), balance("(dfsfs(ff(sef(fdfd)fsfff)))".toList))
}

