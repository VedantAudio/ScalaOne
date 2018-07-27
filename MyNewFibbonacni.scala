object MyNewFibbonacni extends App {

  def myFib(rangNum: Int): Int = {

    if (rangNum==0) return 0
    if (rangNum==1) return 1
    myFib(rangNum-1)+myFib(rangNum-2)

  }

println(myFib(9))
}
