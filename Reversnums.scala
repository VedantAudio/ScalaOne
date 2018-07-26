object Reversnums extends App {
  def reverse(x: Int): Int = {
    var myznak: Int = x
    var newlimit: String = "2147483648"
    var mylimit: Int = 0
    var reverx: String = x.toString.filter(_ != '-')
    reverx = reverx.reverse
    var i: Int = 0
    var a: Int = 0
    while (i < reverx.length) {
      if (reverx.slice(0, 0) == "0") reverx = reverx.slice(1, reverx.length - 1)
      i += 1
    }
    if (reverx.length == newlimit.length) {
      while (a <= reverx.length) {
        if ((reverx.substring(a, a + 1) == newlimit.substring(a, a + 1)) && (reverx.substring(0, 1).toInt >= 2)) {
          a += 1
          if (reverx.substring(a, a + 1).toInt < newlimit.substring(a, a + 1).toInt) a = reverx.length + 1
        }
        else if (reverx.substring(a, a + 1).toInt > newlimit.substring(a, a + 1).toInt) {
          a = reverx.length + 1
          return 0
        }
      }
    }
    if (myznak < 0) {
      reverx = "-" + reverx
    }
    reverx.toInt
  }

  println(reverse(-2147483648))
}



