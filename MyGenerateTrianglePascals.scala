object MyGenerateTrianglePascals extends App {

  def generate(numRows: Int): List[List[Int]] = {

    var i: Int = 1
    var myLastNewArray = new Array[Int](i)
    var myReturn: List[List[Int]] = List()
    var myNumRows: Int = numRows
    while (i <= myNumRows.abs) {
      var myNewArray = new Array[Int](i)
      myNewArray(0) = 1
      myNewArray(myNewArray.length - 1) = 1
      var n = 1
      if (i > 2) {
        while (n <= myNewArray.length - 2) {
          myNewArray(n) = myLastNewArray(n - 1) + myLastNewArray(n)
          n += 1
        }
      }
      i += 1
      myReturn = myReturn ::: List(myNewArray.toList)
      myLastNewArray = myNewArray
    }
    myReturn
  }

  println(generate(5))
}

