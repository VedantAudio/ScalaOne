object MainWindow extends App {
  println("Enter speed scroll: 1 to 9 (where 0,0x second)")
  var speedScroll:Int= scala.io.StdIn.readInt()
  var x: Int = 0
  var i: Int = 0
  var p: Int = 0
  var o = scala.util.Random
var timesOn:Int=0
  var fildButtle: Map[Int, Int] = Map()
  while (timesOn < 1) {
    i = 1
    p = 0
    println("\n-------------------------------------------------------------------------------------------------------")
    while (i < 100) {
x=0
      while (x < 100) {
        p = o.nextInt(103-((10-speedScroll)*9))
        fildButtle += (x -> p)
        x += 1
      }
        if (fildButtle.get(i) == Option(1)) print(o.nextInt(4))
        else if (fildButtle.get(i) == Option(0)) print(o.nextInt(4)+5)
        else print(" ")
      Thread.sleep(speedScroll*10)
      i += 1
    }
  }
}
