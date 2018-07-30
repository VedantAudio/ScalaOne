object Parents extends App {
  var myBalance: Int = 0
  
  def balance(chars: List[Char]): Boolean = {
    if (chars.isEmpty) {
      if (myBalance != 0) false
      else true
    }
    else if (chars.head == ')' && (myBalance == 0)) false
    else {
      if (chars.head == '(') myBalance += 1
      if (chars.head == ')') myBalance -= 1
      balance(chars.tail)
    }
  }
  println(balance("(gjfgjgfjgfj)".toList), balance("())(".toList), balance("(dfsfs(ff(sef(fdfd)fsfff".toList))
}
