object GeneratePascCut extends App {

    def getRow(rowIndex: Int): List[Int] = {

      var i: Int = 1
      var myLastNewArray = new Array[Int](i)
      var myReturn: List[Int] = List()

      var myNumRows: Int = rowIndex+1
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

        myLastNewArray = myNewArray
        myReturn =myNewArray.toList
      }

      myReturn
    }

    println(getRow(3))

}

