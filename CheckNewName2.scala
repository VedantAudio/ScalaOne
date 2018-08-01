object MyDataBase extends App {
  var ii: Int = 0
  var myMap = Map(0 -> "Alex", 1 -> "Alex-1", 2 -> "Maria", 3 -> "Maria-1", 4 -> "Petia")
  var usedName: Int = 0

  def checkNewName(newName: String): Boolean = {
    var i: Int = 0
    while (i <= myMap.size) {
      if (myMap.get(i) == Option(newName)) return false
      i += 1
    }
    true
  }

  def putNewName(newName: String): String = {
    var newNameCheck: String = ""
    var i: Int = 0
    while (i <= myMap.size) {
      if (myMap.get(i) == Option(newName)) {
        /** newNameCheck=newName+"-new"
          * myMap=myMap + ((myMap.size + 1) -> newNameCheck) */

        return "This name uzed"
      }
      i += 1
    }
    myMap = myMap + ((myMap.size + 1) -> newName)
    usedName = 1
    "You new Name is " + newName
  }

  while (ii < 1) {
    println("Enter your name")

    val enterName = scala.io.StdIn.readLine()
    println(putNewName(enterName))
    if (usedName == 1) ii = 1
    else println("Please input another name. For example: ")
  }
}
